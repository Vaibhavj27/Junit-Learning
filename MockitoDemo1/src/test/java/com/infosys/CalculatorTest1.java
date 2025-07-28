package com.infosys;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class CalculatorTest1 {
    Calculator1 c=null;
    CalculatorService1 service1= Mockito.mock(CalculatorService1.class);


    @BeforeEach
    void init()
    {
        c= new Calculator1(service1);

    }

    @Test
    public void testPerform()
    {
        doNothing().when(service1).add(25,5);
        c.perform1(25,5);
        verify(service1).add(25,5);
    }
}
