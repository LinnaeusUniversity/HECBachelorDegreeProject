package com.app;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The prototype model automated JUnit test for simple App.
 */
public class ModelSolution1Test {


//    @Test
//    public void testCase_1() {
//        int a = 14;
//        int b = 3;
//        ModelSolution1 model = new ModelSolution1();
//        Assert.assertEquals(17, model.add(a, b));
//    }
//
//
@Test(timeout = 4000)
public void test0()  throws Throwable  {
    ModelSolution1 myEvoSuite0 = new ModelSolution1();
    boolean boolean0 = myEvoSuite0.positive(1670);
    assertTrue(boolean0);
}

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        ModelSolution1 myEvoSuite0 = new ModelSolution1();
        boolean boolean0 = myEvoSuite0.positive(0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        ModelSolution1 myEvoSuite0 = new ModelSolution1();
        boolean boolean0 = myEvoSuite0.positive((-334));
        assertFalse(boolean0);
    }

}
