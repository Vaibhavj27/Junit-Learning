package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Disabled
public class DivisionTest {
    @Test
    @Tag("success")
    void DivTest(){
        CalculationUtil cu=new CalculationUtil();
        Assertions.assertThrows(ArithmeticException.class,()->cu.Division(10,0));
        Assertions.assertDoesNotThrow(()->cu.Division(10,2),"This will generate arithmatic exception in code");
    }
}
