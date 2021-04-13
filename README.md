# HEC Bachelor thesis in Computer science/Software Engineering at Linnaeus University
# GENERATING TESTS SUITES FROM A MODEL SOLUTION
***

### [HEC BACHELOR DEGREE PROJECT REPOSITORY](https://github.com/rqkohistani/HECBachelorDegreeProject)
1. [EVALUATION V1.0](To Do updata this one)
1. [Older version of the Degree Project](https://github.com/rqkohistani/degreeProject)
### [PITEST EVALUATION REPOSITORY](https://github.com/rqkohistani/PiTest)
1. [EVALUATION V.10](https://github.com/rqkohistani/PiTest/blob/main/PITEST%20EVALUATION%20RESULTS%20V%201.0.md)
### [EVOSUITE EVALUATION REPOSITORY](https://github.com/rqkohistani/EvoSuite) 
### [JDK AND MAVEN CONFIGURATION REQUIREMENTS REPOSITORY](https://github.com/rqkohistani/JDK_MAVEN_EVOSUITE)
***

## Preparing the project
## Prerequisites
1. [Java JDK 8](https://java.com/en/download/help/sysreq.html)
2. [Apache Maven 3.6.3 or newer version](https://github.com/rqkohistani/JDK_MAVEN_EVOSUITE)
3. [Lombok Maven dependency and Lombok intellij plugins](https://projectlombok.org/setup/maven)

***
**The Prototype Model generates minimized test suites. experimental is a complete automation 
that takes Java programs and outputs the minimized test suite as final output. 
The prototype model is a complete automation process it only requires
the users to input Java program. The input will be mutated with mutation operators, arithmetic
Operators, Boolean Constants and Operators, increment and decrements and Finally arithmetic
assignments Operators. The prototype model ensures to produce good test suites, therefore it
benefits teachers and other programming developers to reduce the significant amount of work
and resources, and they could use the complete automation prototype model for quicker result.**
***
### Prototype Model Architecture
     
![Prototype model](Update me)
***
#### The prototype model list of supported Mutation operators
#### Note: Only Arithmetic Operators are implemented
No |    Arithmetic | Operators
------- | ---------------- | ---------- 
1  | Arithmetic Operators | /, *, +, -  
2  | Arithmetic Assignments Operators        | /=, *=, -=, +=      
3   | Increment and decrement | ++, --     
4   | Relational Operators   | !=, ==, <=, >=, <, >     
5   | Boolean Operators | &&, \\\| |     
6   | Boolean Constants | True, False   

***
#### Automated test suites

     @Test
        public void testCase_1() {
            int a = 14;
            int b = 3;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(17, model.add(a, b));
        }
    
        @Test
        public void testCase_2() {
            int a = 12;
            int b = 4;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(16, model.add(a, b));
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
            int a = 3;
            int b = 1;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(4, model.add(a, b));
        }
    
        @Test
        public void testCase_5() {
            int a = 20;
            int b = 20;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(40, model.add(a, b));
        }
    
        @Test
        public void testCase_6() {
            int a = 5;
            int b = 17;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(22, model.add(a, b));
        }
    
        @Test
        public void testCase_7() {
            int a = 18;
            int b = 6;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(24, model.add(a, b));
        }
    
        @Test
        public void testCase_8() {
            int a = 13;
            int b = 15;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(28, model.add(a, b));
        }
    
        @Test
        public void testCase_9() {
            int a = 17;
            int b = 5;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(22, model.add(a, b));
        }
    
        @Test
        public void testCase_10() {
            int a = 10;
            int b = 13;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(23, model.add(a, b));
        }
    
        @Test
        public void testCase_11() {
            int a = 17;
            int b = 18;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(35, model.add(a, b));
        }
    
        @Test
        public void testCase_12() {
            int a = 15;
            int b = 6;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(21, model.add(a, b));
        }
    
        @Test
        public void testCase_13() {
            int a = 19;
            int b = 2;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(21, model.add(a, b));
        }
    
        @Test
        public void testCase_14() {
            int a = 13;
            int b = 8;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(21, model.add(a, b));
        }
    
        @Test
        public void testCase_15() {
            int a = 4;
            int b = 9;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(13, model.add(a, b));
        }
    
        @Test
        public void testCase_16() {
            int a = 13;
            int b = 6;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(19, model.add(a, b));
        }
    
        @Test
        public void testCase_17() {
            int a = 9;
            int b = 5;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(14, model.add(a, b));
        }
    
        @Test
        public void testCase_18() {
            int a = 11;
            int b = 11;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(22, model.add(a, b));
        }
    
        @Test
        public void testCase_19() {
            int a = 12;
            int b = 20;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(32, model.add(a, b));
        }
    
        @Test
        public void testCase_20() {
            int a = 5;
            int b = 15;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(20, model.add(a, b));
        }

#### All possible generated pairs "not minimized ones"
    
    
    1 Test case: a = 13 b = 15 = (result on buggy model a - b) = -2 valid value = 28
    2 Test case: a = 13 b = 15 = (result on buggy model a * b) = 195 valid value = 28
    3 Test case: a = 13 b = 15 = (result on buggy model a / b) = 0 valid value = 28
    4 Test case: a = 13 b = 15 = (result on buggy model a) = 13 valid value = 28
    5 Test case: a = 13 b = 15 = (result on buggy model b) = 15 valid value = 28
    6 Test case: a = 14 b = 1 = (result on buggy model a - b) = 13 valid value = 15
    7 Test case: a = 14 b = 1 = (result on buggy model a * b) = 14 valid value = 15
    8 Test case: a = 14 b = 1 = (result on buggy model a / b) = 14 valid value = 15
    9 Test case: a = 14 b = 1 = (result on buggy model a) = 14 valid value = 15
    10 Test case: a = 14 b = 1 = (result on buggy model b) = 1 valid value = 15
    11 Test case: a = 9 b = 5 = (result on buggy model a - b) = 4 valid value = 14
    12 Test case: a = 9 b = 5 = (result on buggy model a * b) = 45 valid value = 14
    13 Test case: a = 9 b = 5 = (result on buggy model a / b) = 1 valid value = 14
    14 Test case: a = 9 b = 5 = (result on buggy model a) = 9 valid value = 14
    15 Test case: a = 9 b = 5 = (result on buggy model b) = 5 valid value = 14
    16 Test case: a = 5 b = 15 = (result on buggy model a - b) = -10 valid value = 20
    17 Test case: a = 5 b = 15 = (result on buggy model a * b) = 75 valid value = 20
    18 Test case: a = 5 b = 15 = (result on buggy model a / b) = 0 valid value = 20
    19 Test case: a = 5 b = 15 = (result on buggy model a) = 5 valid value = 20
    20 Test case: a = 5 b = 15 = (result on buggy model b) = 15 valid value = 20
    21 Test case: a = 17 b = 18 = (result on buggy model a - b) = -1 valid value = 35
    22 Test case: a = 17 b = 18 = (result on buggy model a * b) = 306 valid value = 35
    23 Test case: a = 17 b = 18 = (result on buggy model a / b) = 0 valid value = 35
    24 Test case: a = 17 b = 18 = (result on buggy model a) = 17 valid value = 35
    25 Test case: a = 17 b = 18 = (result on buggy model b) = 18 valid value = 35
    26 Test case: a = 15 b = 6 = (result on buggy model a - b) = 9 valid value = 21
    27 Test case: a = 15 b = 6 = (result on buggy model a * b) = 90 valid value = 21
    28 Test case: a = 15 b = 6 = (result on buggy model a / b) = 2 valid value = 21
    29 Test case: a = 15 b = 6 = (result on buggy model a) = 15 valid value = 21
    30 Test case: a = 15 b = 6 = (result on buggy model b) = 6 valid value = 21
    31 Test case: a = 17 b = 5 = (result on buggy model a - b) = 12 valid value = 22
    32 Test case: a = 17 b = 5 = (result on buggy model a * b) = 85 valid value = 22
    33 Test case: a = 17 b = 5 = (result on buggy model a / b) = 3 valid value = 22
    34 Test case: a = 17 b = 5 = (result on buggy model a) = 17 valid value = 22
    35 Test case: a = 17 b = 5 = (result on buggy model b) = 5 valid value = 22
    36 Test case: a = 12 b = 4 = (result on buggy model a - b) = 8 valid value = 16
    37 Test case: a = 12 b = 4 = (result on buggy model a * b) = 48 valid value = 16
    38 Test case: a = 12 b = 4 = (result on buggy model a / b) = 3 valid value = 16
    39 Test case: a = 12 b = 4 = (result on buggy model a) = 12 valid value = 16
    40 Test case: a = 12 b = 4 = (result on buggy model b) = 4 valid value = 16
    41 Test case: a = 3 b = 1 = (result on buggy model a - b) = 2 valid value = 4
    42 Test case: a = 3 b = 1 = (result on buggy model a * b) = 3 valid value = 4
    43 Test case: a = 3 b = 1 = (result on buggy model a / b) = 3 valid value = 4
    44 Test case: a = 3 b = 1 = (result on buggy model a) = 3 valid value = 4
    45 Test case: a = 3 b = 1 = (result on buggy model b) = 1 valid value = 4
    46 Test case: a = 14 b = 3 = (result on buggy model a - b) = 11 valid value = 17
    47 Test case: a = 14 b = 3 = (result on buggy model a * b) = 42 valid value = 17
    48 Test case: a = 14 b = 3 = (result on buggy model a / b) = 4 valid value = 17
    49 Test case: a = 14 b = 3 = (result on buggy model a) = 14 valid value = 17
    50 Test case: a = 14 b = 3 = (result on buggy model b) = 3 valid value = 17
    51 Test case: a = 19 b = 2 = (result on buggy model a - b) = 17 valid value = 21
    52 Test case: a = 19 b = 2 = (result on buggy model a * b) = 38 valid value = 21
    53 Test case: a = 19 b = 2 = (result on buggy model a / b) = 9 valid value = 21
    54 Test case: a = 19 b = 2 = (result on buggy model a) = 19 valid value = 21
    55 Test case: a = 19 b = 2 = (result on buggy model b) = 2 valid value = 21
    56 Test case: a = 13 b = 8 = (result on buggy model a - b) = 5 valid value = 21
    57 Test case: a = 13 b = 8 = (result on buggy model a * b) = 104 valid value = 21
    58 Test case: a = 13 b = 8 = (result on buggy model a / b) = 1 valid value = 21
    59 Test case: a = 13 b = 8 = (result on buggy model a) = 13 valid value = 21
    60 Test case: a = 13 b = 8 = (result on buggy model b) = 8 valid value = 21
    61 Test case: a = 12 b = 20 = (result on buggy model a - b) = -8 valid value = 32
    62 Test case: a = 12 b = 20 = (result on buggy model a * b) = 240 valid value = 32
    63 Test case: a = 12 b = 20 = (result on buggy model a / b) = 0 valid value = 32
    64 Test case: a = 12 b = 20 = (result on buggy model a) = 12 valid value = 32
    65 Test case: a = 12 b = 20 = (result on buggy model b) = 20 valid value = 32
    66 Test case: a = 4 b = 9 = (result on buggy model a - b) = -5 valid value = 13
    67 Test case: a = 4 b = 9 = (result on buggy model a * b) = 36 valid value = 13
    68 Test case: a = 4 b = 9 = (result on buggy model a / b) = 0 valid value = 13
    69 Test case: a = 4 b = 9 = (result on buggy model a) = 4 valid value = 13
    70 Test case: a = 4 b = 9 = (result on buggy model b) = 9 valid value = 13
    71 Test case: a = 13 b = 6 = (result on buggy model a - b) = 7 valid value = 19
    72 Test case: a = 13 b = 6 = (result on buggy model a * b) = 78 valid value = 19
    73 Test case: a = 13 b = 6 = (result on buggy model a / b) = 2 valid value = 19
    74 Test case: a = 13 b = 6 = (result on buggy model a) = 13 valid value = 19
    75 Test case: a = 13 b = 6 = (result on buggy model b) = 6 valid value = 19
    76 Test case: a = 5 b = 17 = (result on buggy model a - b) = -12 valid value = 22
    77 Test case: a = 5 b = 17 = (result on buggy model a * b) = 85 valid value = 22
    78 Test case: a = 5 b = 17 = (result on buggy model a / b) = 0 valid value = 22
    79 Test case: a = 5 b = 17 = (result on buggy model a) = 5 valid value = 22
    80 Test case: a = 5 b = 17 = (result on buggy model b) = 17 valid value = 22
    81 Test case: a = 11 b = 11 = (result on buggy model a - b) = 0 valid value = 22
    82 Test case: a = 11 b = 11 = (result on buggy model a * b) = 121 valid value = 22
    83 Test case: a = 11 b = 11 = (result on buggy model a / b) = 1 valid value = 22
    84 Test case: a = 11 b = 11 = (result on buggy model a) = 11 valid value = 22
    85 Test case: a = 11 b = 11 = (result on buggy model b) = 11 valid value = 22
    86 Test case: a = 10 b = 13 = (result on buggy model a - b) = -3 valid value = 23
    87 Test case: a = 10 b = 13 = (result on buggy model a * b) = 130 valid value = 23
    88 Test case: a = 10 b = 13 = (result on buggy model a / b) = 0 valid value = 23
    89 Test case: a = 10 b = 13 = (result on buggy model a) = 10 valid value = 23
    90 Test case: a = 10 b = 13 = (result on buggy model b) = 13 valid value = 23
    91 Test case: a = 18 b = 6 = (result on buggy model a - b) = 12 valid value = 24
    92 Test case: a = 18 b = 6 = (result on buggy model a * b) = 108 valid value = 24
    93 Test case: a = 18 b = 6 = (result on buggy model a / b) = 3 valid value = 24
    94 Test case: a = 18 b = 6 = (result on buggy model a) = 18 valid value = 24
    95 Test case: a = 18 b = 6 = (result on buggy model b) = 6 valid value = 24
    96 Test case: a = 20 b = 20 = (result on buggy model a - b) = 0 valid value = 40
    97 Test case: a = 20 b = 20 = (result on buggy model a * b) = 400 valid value = 40
    98 Test case: a = 20 b = 20 = (result on buggy model a / b) = 1 valid value = 40
    99 Test case: a = 20 b = 20 = (result on buggy model a) = 20 valid value = 40
    100 Test case: a = 20 b = 20 = (result on buggy model b) = 20 valid value = 40
***
#### **Mvn test**

    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running com.testsuite.TestModel1
    Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.095 sec
    
    Results :
    
    Tests run: 20, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.245 s
    [INFO] Finished at: 2021-04-13T16:00:54+02:00
    [INFO] ------------------------------------------------------------------------


***

#### Automated minimized test suites 18 test suites
    
    @Test
        public void testCase_1() {
            int a = 10;
            int b = 6;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(16, model.add(a, b));
        }
    
        @Test
        public void testCase_2() {
            int a = 12;
            int b = 4;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(16, model.add(a, b));
        }
    
        @Test
        public void testCase_3() {
            int a = 13;
            int b = 1;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(14, model.add(a, b));
        }
    
        @Test
        public void testCase_4() {
            int a = 12;
            int b = 13;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(25, model.add(a, b));
        }
    
        @Test
        public void testCase_5() {
            int a = 16;
            int b = 6;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(22, model.add(a, b));
        }
    
        @Test
        public void testCase_6() {
            int a = 4;
            int b = 7;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(11, model.add(a, b));
        }
    
        @Test
        public void testCase_7() {
            int a = 17;
            int b = 3;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(20, model.add(a, b));
        }
    
        @Test
        public void testCase_8() {
            int a = 13;
            int b = 7;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(20, model.add(a, b));
        }
    
        @Test
        public void testCase_9() {
            int a = 10;
            int b = 9;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(19, model.add(a, b));
        }
    
        @Test
        public void testCase_10() {
            int a = 18;
            int b = 1;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(19, model.add(a, b));
        }
    
        @Test
        public void testCase_11() {
            int a = 11;
            int b = 16;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(27, model.add(a, b));
        }
    
        @Test
        public void testCase_12() {
            int a = 11;
            int b = 17;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(28, model.add(a, b));
        }
    
        @Test
        public void testCase_13() {
            int a = 7;
            int b = 14;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(21, model.add(a, b));
        }
    
        @Test
        public void testCase_14() {
            int a = 9;
            int b = 13;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(22, model.add(a, b));
        }
    
        @Test
        public void testCase_15() {
            int a = 4;
            int b = 12;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(16, model.add(a, b));
        }
    
        @Test
        public void testCase_16() {
            int a = 17;
            int b = 13;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(30, model.add(a, b));
        }
    
        @Test
        public void testCase_17() {
            int a = 5;
            int b = 15;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(20, model.add(a, b));
        }
    
        @Test
        public void testCase_18() {
            int a = 18;
            int b = 10;
            ModelSolution1 model = new ModelSolution1();
            Assert.assertEquals(28, model.add(a, b));
        }
        
#### **Mvn test**
    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running com.testsuite.TestModel1
    Tests run: 18, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.096 sec
    
    Results :
    
    Tests run: 18, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.176 s
    [INFO] Finished at: 2021-04-13T16:05:57+02:00
    [INFO] ------------------------------------------------------------------------
