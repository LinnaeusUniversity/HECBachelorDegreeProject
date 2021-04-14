package com.testsuite;import org.junit.Assert;import org.junit.Test;import com.testsuite.examples.model1.ModelSolution1;public class TestModel1 {@Test
public void testCase_1() {
		int a = 4 ;		int b = 5 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 9 , model.add(a, b));}
@Test
public void testCase_2() {
		int a = 4 ;		int b = 6 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 10 , model.add(a, b));}
@Test
public void testCase_3() {
		int a = 6 ;		int b = 5 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 11 , model.add(a, b));}
@Test
public void testCase_4() {
		int a = 16 ;		int b = 17 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 33 , model.add(a, b));}
@Test
public void testCase_5() {
		int a = 11 ;		int b = 19 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 30 , model.add(a, b));}
@Test
public void testCase_6() {
		int a = 16 ;		int b = 18 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 34 , model.add(a, b));}
@Test
public void testCase_7() {
		int a = 11 ;		int b = 9 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 20 , model.add(a, b));}
@Test
public void testCase_8() {
		int a = 12 ;		int b = 18 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 30 , model.add(a, b));}
@Test
public void testCase_9() {
		int a = 5 ;		int b = 20 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 25 , model.add(a, b));}
@Test
public void testCase_10() {
		int a = 17 ;		int b = 16 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 33 , model.add(a, b));}
@Test
public void testCase_11() {
		int a = 6 ;		int b = 13 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 19 , model.add(a, b));}
@Test
public void testCase_12() {
		int a = 7 ;		int b = 12 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 19 , model.add(a, b));}
@Test
public void testCase_13() {
		int a = 16 ;		int b = 16 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 32 , model.add(a, b));}
@Test
public void testCase_14() {
		int a = 17 ;		int b = 11 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 28 , model.add(a, b));}
@Test
public void testCase_15() {
		int a = 18 ;		int b = 9 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 27 , model.add(a, b));}
@Test
public void testCase_16() {
		int a = 15 ;		int b = 11 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 26 , model.add(a, b));}
@Test
public void testCase_17() {
		int a = 1 ;		int b = 12 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 13 , model.add(a, b));}
@Test
public void testCase_18() {
		int a = 9 ;		int b = 12 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 21 , model.add(a, b));}
@Test
public void testCase_19() {
		int a = 8 ;		int b = 20 ;		ModelSolution1 model = new ModelSolution1();		Assert.assertEquals( 28 , model.add(a, b));}

 }