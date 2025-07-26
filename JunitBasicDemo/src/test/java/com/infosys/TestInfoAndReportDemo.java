package com.infosys;

import org.junit.jupiter.api.*;

public class TestInfoAndReportDemo {
    CalculationUtil cu;
    TestInfo testInfo;
    TestReporter testReporter;
    @BeforeEach
    void init(TestInfo testInfo,TestReporter testReporter)
    {   this.testInfo=testInfo;
        this.testReporter=testReporter;
        cu=new CalculationUtil();
        System.out.println("Before each is executed");
    }

    @Test
    @DisplayName("adding test")
    @Tag("first")
    void AddTest(){
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        int actual=cu.add(20,10);
        int expected=30;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("multiply test")
    void MultiplyTest(){
         testReporter.publishEntry("Running class is"+testInfo.getTestClass()+"\n Running method is"+testInfo.getTestMethod()+"\nDisplay name of current test is"+testInfo.getDisplayName());
        int actual=cu.multiply(10,20);
        int expected=200;
        Assertions.assertEquals(expected,actual);
    }
}
