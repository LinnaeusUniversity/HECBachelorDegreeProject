package com.testsuite;

import com.testsuite.examples.model1.ModelSolution1;
import org.junit.Assert;
import org.junit.Test;

public class TestModel1 {
    @Test
    public void testCase_1() {
        int a = 14;
        int b = 10;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(24, model.add(a, b));
    }

    @Test
    public void testCase_2() {
        int a = 19;
        int b = 16;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(35, model.add(a, b));
    }

    @Test
    public void testCase_3() {
        int a = 14;
        int b = 1;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(15, model.add(a, b));
    }

    @Test
    public void testCase_4() {
        int a = 20;
        int b = 15;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(35, model.add(a, b));
    }

    @Test
    public void testCase_5() {
        int a = 3;
        int b = 10;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(13, model.add(a, b));
    }

    @Test
    public void testCase_6() {
        int a = 2;
        int b = 14;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(16, model.add(a, b));
    }

    @Test
    public void testCase_7() {
        int a = 13;
        int b = 17;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(30, model.add(a, b));
    }

    @Test
    public void testCase_8() {
        int a = 15;
        int b = 16;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(31, model.add(a, b));
    }

    @Test
    public void testCase_9() {
        int a = 9;
        int b = 2;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(11, model.add(a, b));
    }

    @Test
    public void testCase_10() {
        int a = 7;
        int b = 5;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(12, model.add(a, b));
    }

}