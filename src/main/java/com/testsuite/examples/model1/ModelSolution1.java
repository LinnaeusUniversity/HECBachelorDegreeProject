package com.testsuite.examples.model1;

// The model solution: contains a concrete implementation of the method as defined in the Model1Interface
public class ModelSolution1 implements ModelSolution1Interface {

    // concrete implementation of the method add as in the ModelSolutionInterface interface
    @Override
    public int add(int a, int b) {
        return a + b;
    }

}
