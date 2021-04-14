# HEC Bachelor thesis in Computer science/Software Engineering at Linnaeus University
# GENERATING TESTS SUITES FROM A MODEL SOLUTION
***
# EVALUATION V1.0
***
## Score/Results
## Number of test 20
## Code coverage over all 100%
## Prototype model Test Suites Run time in 3 s and 480 ms
##  EvoSuite Results
### 1. Generated 3 Test suites for the Model Solution
### 2. Coverage: class 100%(1/1) method 100%(1/1) Line 100% (1/1)  
## Manual Test suites
### 1. Generated 4 manual Test suites for the Model Solution
### 2. Coverage class 100%(1/1) method 100%(1/1) Line 100% (1/1)
## Pit Test Coverage 
### 1. For the 20 automated test suites: Coverage class 100%(1/1) method 100%(1/1) Line 100% (1/1)
### 2. Generated 2 mutations Killed 2 (100%)
### 3. Ran 2 tests (1 tests per mutation) 
## Mutation Score
### 1. Mutation Score=(Killed mutants/Total number of Mutants) * 100
The prototype model generated 5 buggy version of the model solution. Each buggy version has been check with the 
model solution and the difference are saved as not minimized test cases. In total there are 20 Integer pairs. 
E.g 13, 15... Which these pairs were check for all possible mutants. 5 buggy version * 20 pairs, hence total 100 
test cases "mutants". So now, the prototype model has generated 100 test case and JUnit test suites. 
The final results:
If the score is 100%, the experimental results indicates that generated mutants were all killed. 

## Conclusion, The prototype model is performing faster than EvoSuite by generating Test suites for the model solution.
***   
#### Model Solution

     public int add(int a, int b) {
            return a + b;
        }
***
## First execution:
### 1. The Prototype model generated
### 2. 5 Buggy version, [the mutants](https://github.com/rqkohistani/HECBachelorDegreeProject).
### 3. 20 Integer pairs
### 4. 100 test cases
### 5. 20 automated test suites
***
## Second execution:
### 1. The Prototype model generated 
### 2. 5 Buggy version, [the mutants](https://github.com/rqkohistani/HECBachelorDegreeProject).
### 3. 20 Integer pairs
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
#### 1.7 Pit Test Coverage Report
##### 1.7.1 Package Summary
![Package Summary](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/pit-reports/First20TestSuites%20202104140927/package%20summary.png)
    
##### 1.7.2 Project Summary    
![Project Summary](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/pit-reports/First20TestSuites%20202104140927/Project%20Summary.png)
        
##### 1.7.3 Mutations
![Mutations Summary](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/pit-reports/First20TestSuites%20202104140927/Mutations.png)
***


 

## 2. The second 18 automated test suites from the prototype model
#### 2.1. mvn clean
#### 2.2 mvn validate
#### 2.3 mvn compile
#### 2.4 mvn test
#### 2.5 Run the Pitest Runner
#### 2.6 Console output  
***
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
#### 2.7 Pit Test Coverage Report
##### 2.7.1 Package Summary
![Package Summary](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/pit-reports/Second18TestSuites%20202104140930/Package%20Summary.png)
    
##### 2.7.2 Project Summary    
![Project Summary](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/pit-reports/Second18TestSuites%20202104140930/Project%20Summary.png)
        
##### 2.7.3 Mutations
![Mutations Summary](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/pit-reports/Second18TestSuites%20202104140930/Mutations.png)
***

## EvoSuite Results
#### 1. mvn clean
#### 1. mvn validate
#### 1. mvn compile
#### 1. mvn test
    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running evoSuite.MyEvoSuiteTest
    Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.094 sec
    
    Results :
    
    Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  2.702 s
    [INFO] Finished at: 2021-04-14T10:23:18+02:00
    [INFO] -------------------------------------------
    
#### 1. evosuite:coverage
    [INFO] * EvoSuite 1.0.6
    [INFO] * Found 1 matching classes in target C:\Users\rashi\Desktop\Thesis\EvoSuite\target\classes
    [INFO] * Computation finished
    [INFO] * Writing statistics
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  9.065 s
    [INFO] Finished at: 2021-04-14T10:24:10+02:00

#### 1. evosuite:generate
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  21.044 s
    [INFO] Finished at: 2021-04-14T10:25:15+02:00

#### 1.evosuite:export
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  1.524 s
    [INFO] Finished at: 2021-04-14T10:26:04+02:00
#### MyEvoSuite_ESTest
    
    @RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
    public class MyEvoSuite_ESTest extends MyEvoSuite_ESTest_scaffolding {
    
      @Test(timeout = 4000)
      public void test0()  throws Throwable  {
          MyEvoSuite myEvoSuite0 = new MyEvoSuite();
          int int0 = myEvoSuite0.add(126, 0);
          assertEquals(126, int0);
      }
    
      @Test(timeout = 4000)
      public void test1()  throws Throwable  {
          MyEvoSuite myEvoSuite0 = new MyEvoSuite();
          int int0 = myEvoSuite0.add((-1314), 126);
          assertEquals((-1188), int0);
      }
    
      @Test(timeout = 4000)
      public void test2()  throws Throwable  {
          MyEvoSuite myEvoSuite0 = new MyEvoSuite();
          int int0 = myEvoSuite0.add(0, 0);
          assertEquals(0, int0);
      }


#### MyEvoSuite_ESTest_scaffolding
    
    @EvoSuiteClassExclude
    public class MyEvoSuite_ESTest_scaffolding {
    
      @org.junit.Rule 
      public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
    
      private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 
    
      private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);
    
    
      @BeforeClass 
      public static void initEvoSuiteFramework() { 
        org.evosuite.runtime.RuntimeSettings.className = "evoSuite.MyEvoSuite"; 
        org.evosuite.runtime.GuiSupport.initialize(); 
        org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
        org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
        org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
        org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
        org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
        org.evosuite.runtime.classhandling.JDKClassResetter.init();
        setSystemProperties();
        initializeClasses();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
      } 
    
      @AfterClass 
      public static void clearEvoSuiteFramework(){ 
        Sandbox.resetDefaultSecurityManager(); 
        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
      } 
    
      @Before 
      public void initTestCase(){ 
        threadStopper.storeCurrentThreads();
        threadStopper.startRecordingTime();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
        org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
        setSystemProperties(); 
        org.evosuite.runtime.GuiSupport.setHeadless(); 
        org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
        org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
      } 
    
      @After 
      public void doneWithTestCase(){ 
        threadStopper.killAndJoinClientThreads();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
        org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
        resetClasses(); 
        org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
        org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
        org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
      } 
    
      public static void setSystemProperties() {
     
        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
        java.lang.System.setProperty("file.encoding", "Cp1252"); 
        java.lang.System.setProperty("java.awt.headless", "true"); 
        java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\rashi\\AppData\\Local\\Temp\\"); 
        java.lang.System.setProperty("user.country", "US"); 
        java.lang.System.setProperty("user.dir", "C:\\Users\\rashi\\Desktop\\Thesis\\EvoSuite"); 
        java.lang.System.setProperty("user.home", "C:\\Users\\rashi"); 
        java.lang.System.setProperty("user.language", "en"); 
        java.lang.System.setProperty("user.name", "rashid"); 
        java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
      }
    
      private static void initializeClasses() {
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MyEvoSuite_ESTest_scaffolding.class.getClassLoader() ,
          "evoSuite.MyEvoSuite"
        );
      } 
    
      private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MyEvoSuite_ESTest_scaffolding.class.getClassLoader()); 
    
        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
          "evoSuite.MyEvoSuite"
        );
      }

#### mvn test
    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.31 sec
    
    Results :
    
    Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.398 s
    [INFO] Finished at: 2021-04-14T11:04:01+02:00
***
#### Incremental build model technique process
![Incremental build model technique process](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/Diagrams/Evaluation%20v3.0.png)


***
### Prototype Model Architecture
     
![Prototype model](https://github.com/rqkohistani/HECBachelorDegreeProject/blob/main/src/main/resources/Diagrams/Prototype%20model%20v3.0.png)
***

