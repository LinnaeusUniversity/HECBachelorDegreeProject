package com.testsuite.examples.model1.mutations;

import com.testsuite.examples.model1.ModelSolution1Interface;

// buggy version 5
public class ModelSolution1Buggy6 implements ModelSolution1Interface {

    @Override
    public int add(int a, int b) {
        return b*10;
    }

    @Override
    public String toString() {
//        return this.getClass().getName()+" b * 10";
        return "b * 10";
    }

}
