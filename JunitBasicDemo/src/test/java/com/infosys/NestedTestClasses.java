package com.infosys;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;


public class NestedTestClasses {
    CalculationUtil cu;
    @BeforeEach
    void init()
    {
        cu=new CalculationUtil();
    }

    @Nested
    class AdditionTest{
        @Test
        @DisplayName("addition test for positive value")
        void add_test_positive()
        {
            int actual=cu.add(10,20);
            int expected=30;
            Assertions.assertEquals(expected,actual);
        }
        @DisplayName("Addition test for negative value")
        @Test
        void add_test_negative()
        {    int actual=cu.add(-10,-20);

            Assertions.assertEquals(-30,actual);
        }
    }
}
