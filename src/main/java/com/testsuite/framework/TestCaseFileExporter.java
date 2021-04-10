package com.testsuite.framework;

import com.testsuite.framework.exceptions.TestSuiteException;
import com.testsuite.framework.model.TestCase;
import com.testsuite.framework.model.TestSuite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TestCaseFileExporter {

    // write the final results to the fileName
    public void exportToFile(final TestSuite finalResults, final String fileName) {
        if (finalResults == null) {
            throw new TestSuiteException("No test suite data to export!");
        }

        FileWriter writer;
        try {
            File file = new File(fileName);

            // delete existing file if present
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }

            writer = new FileWriter(fileName);

            List<TestCase> testCases = finalResults.getTestSuites();
            for (TestCase cass: testCases) {
                String text = cass.getText() + "\n";
                writer.write(text);
            }

            writer.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
