package com.testsuite.framework.model;

import lombok.Data;

import java.util.List;

// a list of TestCases
@Data
public class TestSuite {

    private List<TestCase> testSuites;

}
