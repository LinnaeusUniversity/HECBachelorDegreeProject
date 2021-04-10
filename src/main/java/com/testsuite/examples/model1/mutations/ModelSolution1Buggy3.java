package com.testsuite.examples.model1.mutations;

import com.testsuite.examples.model1.ModelSolution1Interface;

// buggy version 3
public class ModelSolution1Buggy3 implements ModelSolution1Interface {

    @Override
    public int add(int a, int b) {
        return a / b;
    }

    @Override
    public String toString() {
        return "a / b";
    }

}
