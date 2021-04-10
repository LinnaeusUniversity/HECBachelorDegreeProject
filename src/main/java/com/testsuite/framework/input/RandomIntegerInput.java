package com.testsuite.framework.input;

public class RandomIntegerInput {

    public static final int MAX_VALUE = 20;

    private int a;
    private int b;

    public int getA() {
        return (int)(Math.random() * MAX_VALUE) + 1;
    }

    public int getB() {
        return (int)(Math.random() * MAX_VALUE) + 1;
    }

}
