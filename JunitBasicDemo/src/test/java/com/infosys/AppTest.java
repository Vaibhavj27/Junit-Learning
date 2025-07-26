package com.infosys;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    CalculationUtil cu;
    @BeforeAll
    static void beforeallInit(){
        System.out.println("before all is executed");
    }
    @BeforeEach
    void init()
    {    cu=new CalculationUtil();
        System.out.println("Before each is executed");
    }
    @AfterEach
    void initaftereach()
    {
        System.out.println("after each is executed");
    }
    @AfterAll
    static void afterAllInit(){
        System.out.println("After all is executed");
    }

    //all test cases run parallely
    @Test
    void testshow()
    {
        System.out.println("Hello world");
    }

    @Test
    @DisplayName("adding test")
    void AddTest(){
        CalculationUtil cu=new CalculationUtil();
        int actual=cu.add(20,10);
        int expected=30;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("multiply test")
    void MultiplyTest(){
        CalculationUtil cu=new CalculationUtil();
        int actual=cu.multiply(10,20);
        int expected=200;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @Disabled //we can disable any particular test with this annotation
    void FailedTest()
    {
        Assertions.fail("This test is going to fail always");
    }

    @Test
    void StringNotNullTest()
    {
        CalculationUtil cu=new CalculationUtil();
        String input="abcd";
       String res =cu.parseString(input);
       try{
           Assertions.assertNotNull(res);
       } catch (Exception e) {
           throw new NullPointerException();
       }
    }

    @Test
    void DivTest(){
        CalculationUtil cu=new CalculationUtil();
        Assertions.assertThrows(ArithmeticException.class,()->cu.Division(10,0));
        Assertions.assertDoesNotThrow(()->cu.Division(10,2),"This will generate arithmatic exception in code");
    }

    @Test
    void CompareObject()
    {
        // these two will be stored in String pool i.e both will refer to same object as "hi"="hi"
        String s1="hi";
        String s2="hi";
        assertSame(s1,s2);
        //this notation generate new object and store in Heap memory
        String S3=new String("hi");
        String S4=new String("hi");
        //even for string  S3 and S4 will test fail as they point to different objects
       // Assertions.assertSame(s1,S3);
    }


    //assertAll is true only when all tests are true
    @Test
    @DisplayName("Using assertall")
    void AssertAll()
    {
        int actual= cu.multiply(0,5);
        int actual2= cu.multiply(5,6);
        int actual3= cu.multiply(1,2);

        assertAll(
                ()->assertEquals(0,actual),
                ()->assertEquals(30,actual2),
                ()->assertEquals(2,actual3)
        );
    }

    @RepeatedTest(3)
    @DisplayName("Repetition test")
    void repeatedTest(RepetitionInfo repetitionInfo)
    {
        System.out.println(repetitionInfo.getCurrentRepetition());
         assertEquals("hi","hi");
    }
}
