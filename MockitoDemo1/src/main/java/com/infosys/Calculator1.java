package com.infosys;

public class Calculator1 {
    CalculatorService1 calculatorService1;

    Calculator1(CalculatorService1 calculatorService)
    {
        this.calculatorService1=calculatorService;
    }

    public int perform(int x ,int y)
    {
        return calculatorService1.divide(x,y);
    }

    public void perform1(int x ,int y)
    {
         calculatorService1.add(x,y);
    }
}
