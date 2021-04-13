package com.testsuite.examples.model1.mutations;

import com.testsuite.examples.model1.ModelSolution1Interface;

// Equivalent version 1
public class ModelSolution1Equivalent1 implements ModelSolution1Interface {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "a + b";
    }

}
