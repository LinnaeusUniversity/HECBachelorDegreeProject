# HEC Bachelor thesis in Computer science/Software Engineering at Linnaeus University
# GENERATING TESTS SUITES FROM A MODEL SOLUTION
***
# EVALUATION V1.0
***
#### Model Solution

     public int add(int a, int b) {
            return a + b;
        }
***
### 1. The Prototype model generated: First execution
### 2. 5 Buggy version, [the mutants](https://github.com/rqkohistani/HECBachelorDegreeProject).
### 3. 20 pairs
### 4. 100 test cases
### 5. 20 automated test suites
***
### 
### 1. The Prototype model generated: Second execution
### 2. 5 Buggy version, [the mutants](https://github.com/rqkohistani/HECBachelorDegreeProject).
### 3. 20 pairs
### 4. 100 test cases
### 5. 18 automated test suites
***
## Pitest Results
### 1. The first 20 automated test suites from the prototype model
#### 1.1. mvn clean
#### 1.2 mvn validate
#### 1.3 mvn compile
#### 1.4 mvn test
#### 1.5 Run the Pitest Runner
#### 1.6 Console output
    /================================================================================
    - Mutators
    ================================================================================
    > org.pitest.mutationtest.engine.gregor.mutators.ReturnValsMutator
    >> Generated 1 Killed 1 (100%)
    > KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
    > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
    > NO_COVERAGE 0 
    --------------------------------------------------------------------------------
    > org.pitest.mutationtest.engine.gregor.mutators.MathMutator
    >> Generated 1 Killed 1 (100%)
    > KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
    > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
    > NO_COVERAGE 0 
    --------------------------------------------------------------------------------
    ================================================================================
    - Timings
    ================================================================================
    > scan classpath : < 1 second
    > coverage and dependency analysis : < 1 second
    > build mutation tests : < 1 second
    > run mutation analysis : < 1 second
    --------------------------------------------------------------------------------
    > Total  : 1 seconds
    --------------------------------------------------------------------------------
    ================================================================================
    - Statistics
    ================================================================================
    >> Generated 2 mutations Killed 2 (100%)
    >> Ran 2 tests (1 tests per mutation)
    09:27:58 PIT >> INFO : Completed in 1 seconds
***
## 2. The second 18 automated test suites from the prototype model
#### 2.1. mvn clean
#### 2.2 mvn validate
#### 2.3 mvn compile
#### 2.4 mvn test
#### 2.5 Run the Pitest Runner
#### 2.6 Console output  
    /================================================================================
    - Mutators
    ================================================================================
    > org.pitest.mutationtest.engine.gregor.mutators.ReturnValsMutator
    >> Generated 1 Killed 1 (100%)
    > KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
    > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
    > NO_COVERAGE 0 
    --------------------------------------------------------------------------------
    > org.pitest.mutationtest.engine.gregor.mutators.MathMutator
    >> Generated 1 Killed 1 (100%)
    > KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
    > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
    > NO_COVERAGE 0 
    --------------------------------------------------------------------------------
    ================================================================================
    - Timings
    ================================================================================
    > scan classpath : < 1 second
    > coverage and dependency analysis : < 1 second
    > build mutation tests : < 1 second
    > run mutation analysis : < 1 second
    --------------------------------------------------------------------------------
    > Total  : 1 seconds
    --------------------------------------------------------------------------------
    ================================================================================
    - Statistics
    ================================================================================
    >> Generated 2 mutations Killed 2 (100%)
    >> Ran 2 tests (1 tests per mutation)
    09:30:27 PIT >> INFO : Completed in 1 seconds
***
#### 1. 
#### 1. 
#### 1. 
#### 1.  








## EvoSuite Results

#### 1. mvn validate
    [INFO] BUILD SUCCESS
    [INFO] --------------------------------------
    [INFO] Total time:  0.126 s
    [INFO] Finished at: 2021-04-14T08:56:03+02:00
#### 1. mvn compile
    [INFO] BUILD SUCCESS
    [INFO] -------------------------------------
    [INFO] Total time:  1.894 s
    [INFO] Finished at: 2021-04-14T08:57:23+02:00
#### 1. mvn test
    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running evoSuite.MyEvoSuiteTest
    Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.101 sec
    
    Results :
    
    Tests run: 20, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------
    [INFO] Total time:  2.722 s
    [INFO] Finished at: 2021-04-14T08:57:57+02:00
#### 1. evosuite:coverage
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------
    [INFO] Total time:  9.135 s
    [INFO] Finished at: 2021-04-14T08:59:13+02:00
#### 1. evosuite:generate
    [INFO] BUILD SUCCESS
    [INFO] --------------------------------------
    [INFO] Total time:  21.122 s
    [INFO] Finished at: 2021-04-14T09:01:03+02:00
#### 1.


#### Incremental build model technique process
![Incremental build model technique process](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/Diagrams/Evaluation%20v3.0.png)



### Prototype Model Architecture
     
![Prototype model](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/Diagrams/Prototype%20model%20v3.0.png)
***

