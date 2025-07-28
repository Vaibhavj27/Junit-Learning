package com.infosys;

public class Calculator {

    CalculatorService calculatorService;

    Calculator(CalculatorService calculatorService)
    {
        this.calculatorService=calculatorService;
    }

    public int perform(int x ,int y)
    {
        return calculatorService.divide(x,y);
    }
}
