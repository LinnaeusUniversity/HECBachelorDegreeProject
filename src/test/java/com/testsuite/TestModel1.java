package com.testsuite;

import com.testsuite.examples.model1.ModelSolution1;
import org.junit.Assert;
import org.junit.Test;

public class TestModel1 {
    @Test
    public void testCase_1() {
        int a = 16;
        int b = 1;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(17, model.add(a, b));
    }

    @Test
    public void testCase_2() {
        int a = 3;
        int b = 20;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(23, model.add(a, b));
    }

    @Test
    public void testCase_3() {
        int a = 19;
        int b = 18;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(37, model.add(a, b));
    }

    @Test
    public void testCase_4() {
        int a = 7;
        int b = 12;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(19, model.add(a, b));
    }

    @Test
    public void testCase_5() {
        int a = 19;
        int b = 9;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(28, model.add(a, b));
    }

    @Test
    public void testCase_6() {
        int a = 1;
        int b = 14;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(15, model.add(a, b));
    }

    @Test
    public void testCase_7() {
        int a = 7;
        int b = 16;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(23, model.add(a, b));
    }

    @Test
    public void testCase_8() {
        int a = 1;
        int b = 11;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(12, model.add(a, b));
    }

    @Test
    public void testCase_9() {
        int a = 14;
        int b = 7;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(21, model.add(a, b));
    }

    @Test
    public void testCase_10() {
        int a = 12;
        int b = 6;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(18, model.add(a, b));
    }

}