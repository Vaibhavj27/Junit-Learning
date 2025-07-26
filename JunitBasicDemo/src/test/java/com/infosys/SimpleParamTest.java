package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleParamTest {
    CalculationUtil cu;

    @BeforeEach
    void init()
    {
        cu=new CalculationUtil();
    }

    @ParameterizedTest
    @ValueSource(ints = {4,6,5,8,7})
    void IsEvenTest(int a)
    {
       Assertions.assertTrue( cu.isEven(a));
    }

    @ParameterizedTest
    @NullSource
    void CheckNull(String value)
    {
        Assertions.assertNull(value);
    }
    @ParameterizedTest
    @EmptySource
    void CheckEmpty(String value)
    {
        Assertions.assertEquals("",value);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void CheckNullAndEmpty(String value)
    {
        Assertions.assertTrue(value==null ||value.isEmpty());
    }
}
