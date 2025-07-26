package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    @DisplayName("adding test")
    @Tag("success")
    void AddTest(){
        CalculationUtil cu=new CalculationUtil();
        int actual=cu.add(20,10);
        int expected=30;
        Assertions.assertEquals(expected,actual);
    }

}
