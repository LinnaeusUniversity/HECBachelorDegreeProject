package com.testsuite.examples.model1.mutations;

import com.testsuite.examples.model1.ModelSolution1Interface;

// buggy version 5
public class ModelSolution1Buggy5 implements ModelSolution1Interface {

    @Override
    public int add(int a, int b) {
        return b;
    }

    @Override
    public String toString() {
        return "b";
    }

}
