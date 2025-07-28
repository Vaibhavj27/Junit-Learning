package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

public class CalculatorTest {

CalculatorService calculatorService= Mockito.mock(CalculatorService.class);
Calculator calculator=null;
@BeforeEach
 void init()
{
   calculator= new Calculator(calculatorService);

}

@Test
    void testPerform()
{
    Mockito.when(calculatorService.divide(10,0)).thenThrow(ArithmeticException.class);
    Assertions.assertThrows(ArithmeticException.class,()->calculatorService.divide(10,0));
}
}
