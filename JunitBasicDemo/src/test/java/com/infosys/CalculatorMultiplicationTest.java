package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorMultiplicationTest {

    @Test
    @Tag("slow")
    @Tag("fail")
    @DisplayName("multiply test")
    void MultiplyTest(){
        CalculationUtil cu=new CalculationUtil();
        int actual=cu.multiply(10,20);
        int expected=200;
        Assertions.assertEquals(expected,actual);
    }
}
