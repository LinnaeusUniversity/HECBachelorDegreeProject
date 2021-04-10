package com.testsuite.framework.model;

import lombok.Data;

@Data
public class TestCase {

    // text data to store in the file
    private String text;

    private int a;
    private int b;
    private int result;

}
