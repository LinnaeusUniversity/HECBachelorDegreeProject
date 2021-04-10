package com.testsuite.framework;

import com.testsuite.framework.exceptions.TestSuiteException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TemplateEngine {

    public String readTemplate(final String fileName) {
        if ((fileName == null) || ("".equals(fileName)))  {
            throw new TestSuiteException("Invalid template file name!");
        }

        String template = "";

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                template += myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred during loading template file! " + e.getMessage());
            e.printStackTrace();
        }

        return template;
    }

    public String fillTemplate(final HashMap<String, String> map, final String template) {
        String tmp = new String(template);

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String k = iterator.next();
            String value = map.get(k);
            // System.out.println("Replace " + k + " with " + value);
            tmp = tmp.replaceAll(k, value);
        }

        return tmp;
    }

}
