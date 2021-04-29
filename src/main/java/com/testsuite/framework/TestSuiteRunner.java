package com.testsuite.framework;

import com.testsuite.examples.model1.ModelSolution1Interface;
import com.testsuite.framework.exceptions.TestSuiteException;
import com.testsuite.framework.input.RandomIntegerInput;
import com.testsuite.framework.model.TestCase;
import com.testsuite.framework.model.TestSuite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestSuiteRunner {

    // max number of iterations
    public static final int ITERATIONS = 20;

//    Only counts numbers of equivalents mutants
//    private int equivalent=0;
//    counts all possible combination of the test cases.
    private  int testCaseCounter=1;

//    public int getEquivalent() {
//        return equivalent;
//    }

    private TemplateEngine templateEngine;
    private TestCaseFileExporter testCaseFileExporter;
    private HashMap<String, TestCase> map = new HashMap<>();

    public TestSuiteRunner() {
        templateEngine = new TemplateEngine();
        testCaseFileExporter = new TestCaseFileExporter();
    }

    public List<TestCase> generateTestCases(ModelSolution1Interface original,
                                            RandomIntegerInput randomIntegerInput,
                                            List<ModelSolution1Interface> mutations) {
        if (original == null) {
            throw new TestSuiteException("original list cannot be null!");
        }

        if (randomIntegerInput == null) {
            throw new TestSuiteException("randomInput data generator cannot be null!");
        }

        if (mutations == null) {
            throw new TestSuiteException("mutations list cannot be null!");
        }

        // clear the test case hash map to keep only the minimized results
        map.clear();
        System.out.println("All possible generated pairs not minimized ones");
        List<TestCase> list = new ArrayList<>();
        for (int i = 0; i < ITERATIONS; i++) {
            // get a new couple of values
            int a = randomIntegerInput.getA();
            int b = randomIntegerInput.getB();

            // check result on valid model
            int resultOnValidModel = original.add(a, b);

            for (ModelSolution1Interface mutation : mutations) {
                // compute on buggy model
                int result = mutation.add(a , b);
//               All possible generated pairs not minimized ones
                System.out.println(testCaseCounter+" Test case: a = " + a + " b = " + b
                        + " = (result on buggy model " + mutation.toString() + ") = " + result
                        + " valid value = " + resultOnValidModel);
                testCaseCounter++;
                // add the test case only if no valid output
//                avoid the equivalent test cases

                int delta = Math.abs(resultOnValidModel - result);
//                if(delta<=0){
//                    equivalent++;
//                }
                if (delta > 0) {
                    // create the test case to save
                    TestCase testCase = new TestCase();
                    testCase.setA(a);
                    testCase.setB(b);
                    testCase.setResult(resultOnValidModel); // set the correct valid value
                    testCase.setText("Test case: a = " + a + " b = " + b
                            + " = (" + mutation.toString() + ") = " + result);
//todo: fix the txt file mutation problem
                    list.add(testCase);
//                   TestCase(text=Test case: a = 15 b = 7 = (a - b) = 8, a=15, b=7, result=22)
                    map.put(a + "_" + b, testCase);
                    //        {15_7=TestCase(text=Test case: a = 15 b = 7 = (a - b) = 8, a=15, b=7, result=22)}

                }
                else{
//                    Equivalent cases are disregarded

                }

            }
        }   // end of the iterations

        return list;
    }

    //  create the minimized list based on what is contained inside the hash map
//    Taking the values
    public List<TestCase> getMinimizeTestCases() {
        ArrayList<TestCase> minimizedTestCases = new ArrayList<>();
        map.forEach((key, value)->{
            minimizedTestCases.add(value);
        });
//        map.values().forEach( t -> {
//            minimizedTestCases.add(t);
//        });

        return minimizedTestCases;
    }

    // A test suite contains a list of cases
    public TestSuite generateTestSuite(List<TestCase> minimizedCases) {

        TestSuite testSuite = new TestSuite();
        testSuite.setTestSuites(minimizedCases);

        return testSuite;
    }

    public void generateJUnitTests(final TestSuite finalResults,
                                   final String junitOutputFile,
                                   final String templateFile,
                                   final String junitBaseTemplateFile)
    {
        // input check
        if ((junitOutputFile == null) || ("".equals(junitOutputFile)))  {
            throw new TestSuiteException("Invalid junit file name!");
        }

        if ((junitBaseTemplateFile == null) || ("".equals(junitBaseTemplateFile)))  {
            throw new TestSuiteException("Invalid junit Base Template file name!");
        }

        if ((templateFile == null) || ("".equals(templateFile)))  {
            throw new TestSuiteException("Invalid template file name!");
        }

        if (finalResults == null) {
            throw new TestSuiteException("final results cannot be null!");
        }

        // read templates
        String base = templateEngine.readTemplate(junitBaseTemplateFile);
        String template = templateEngine.readTemplate(templateFile);

        FileWriter writer;
        try {
            File file = new File(junitOutputFile);

            // delete existing file if present
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }

            writer = new FileWriter(junitOutputFile);

            // write the initial junit test part
            writer.write(base);

            List<TestCase> testCases = finalResults.getTestSuites();

            int num = 0;
            for (TestCase testCase: testCases) {
                num++;

                // dynamic method name
                writer.write("@Test\npublic void testCase_" + num + "() {\n");

                HashMap<String, String> map = new HashMap<>();
                map.put("#A#", "" + testCase.getA());
                map.put("#B#", "" + testCase.getB());
                map.put("#RESULT#", "" + testCase.getResult());

                writer.write(templateEngine.fillTemplate(map, template));

                // close test method
                writer.write("}\n");
            }

            // close the java class
            writer.write("\n }");

            writer.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void exportToFile(final TestSuite finalResults, final String fileName) {
        testCaseFileExporter.exportToFile(finalResults, fileName);
    }

}
