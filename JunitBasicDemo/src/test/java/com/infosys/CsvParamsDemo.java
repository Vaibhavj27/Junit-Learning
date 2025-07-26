package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class CsvParamsDemo {

    @ParameterizedTest
    @CsvSource({"10,20","2,3"})
    void add(int a,int b)
    {
        Assertions.assertEquals(30,a+b);
    }

    @ParameterizedTest
    @CsvSource({"10,20,30","2,3,5"})
    void add1(int a,int b,int expected)
    {
        Assertions.assertEquals(expected,a+b);
    }
    //in case if someone used other symbol other than "," then we will use this typw
    @ParameterizedTest
    @CsvSource(value = {"10!20","2!3"},delimiterString = "!")
    void add2(int a,int b)
    {
        Assertions.assertEquals(30,a+b);
    }

    //using file
    @ParameterizedTest
    @CsvFileSource(resources = "/Book1.csv",numLinesToSkip = 1)
    void add3(int a,int b,int expected)
    {
        Assertions.assertEquals(expected,a+b);
    }
}
