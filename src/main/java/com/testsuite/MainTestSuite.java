package com.testsuite;

import com.testsuite.examples.model1.ModelSolution1;
import com.testsuite.examples.model1.ModelSolution1Interface;
import com.testsuite.examples.model1.mutations.*;
import com.testsuite.framework.TestSuiteRunner;
import com.testsuite.framework.input.RandomIntegerInput;
import com.testsuite.framework.model.TestCase;
import com.testsuite.framework.model.TestSuite;

import java.util.ArrayList;
import java.util.List;

// Run the TestSuiteRunner and export the generated TestSuite.
// Generate a set of JUnit tests based on the test suite results.
public class MainTestSuite {

    public static void main(String[] args) {
        // 1) Create the test suite Runner
        TestSuiteRunner testSuiteRunner = new TestSuiteRunner();

        // 2) set the mutation's list
        List<ModelSolution1Interface> mutations = new ArrayList<>();
        mutations.add(new ModelSolution1Buggy1());
        mutations.add(new ModelSolution1Buggy2());
        mutations.add(new ModelSolution1Buggy3());
        mutations.add(new ModelSolution1Buggy4());
        mutations.add(new ModelSolution1Buggy5());

        // 3) define a random input
        RandomIntegerInput randomIntegerInput = new RandomIntegerInput();

        // 4) using the runner generate the mutators and the input => test cases not minimized
        testSuiteRunner.generateTestCases(new ModelSolution1(), randomIntegerInput, mutations);

        // 5) get the minimized test cases
        List<TestCase> minimizedCases = testSuiteRunner.getMinimizeTestCases();

        // 6) generate TestSuite based on selected and minimized test cases
        TestSuite finalResults = testSuiteRunner.generateTestSuite(minimizedCases);

        // 7) export to file
        testSuiteRunner.exportToFile(finalResults, "test_suite.txt");

        // 8) generate junit classes
        String curDirectory = System.getProperty("user.dir");

        String templateFolder = "/src/main/resources/templates/";
        String junitOutputTestFolder = "/src/test/java/com/testsuite/";

        testSuiteRunner.generateJUnitTests(finalResults,
                curDirectory + junitOutputTestFolder + "TestModel1.java",
                curDirectory + templateFolder + "Model1.txt",
                curDirectory + templateFolder + "junit_base.txt"
        );
    }

}
