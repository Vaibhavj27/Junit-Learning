package com.infosys;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
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
        CalculationUtil cu= new CalculationUtil();
        Assertions.assertThrows(ArithmeticException.class,()->cu.Division(10,0));
        Assertions.assertDoesNotThrow(()->cu.Division(10,2),"This will generate arithmatic exception in code");
    }

    @Test
    void CompareObject()
    {
        // these two will be stored in String pool i.e both will refer to same object as "hi"="hi"
        String s1="hi";
        String s2="hi";
        Assertions.assertSame(s1,s2);
        //this notation generate new object and store in Heap memory
        String S3=new String("hi");
        String S4=new String("hi");
        //even for string  S3 and S4 will test fail as they point to different objects
       // Assertions.assertSame(s1,S3);
    }
}
