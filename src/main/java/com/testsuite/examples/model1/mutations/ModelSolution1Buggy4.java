package com.testsuite.examples.model1.mutations;

import com.testsuite.examples.model1.ModelSolution1Interface;

// buggy version 4
public class ModelSolution1Buggy4 implements ModelSolution1Interface {

    @Override
    public int add(int a, int b) {
        return a;
    }

    @Override
    public String toString() {
        return "a";
    }

}
