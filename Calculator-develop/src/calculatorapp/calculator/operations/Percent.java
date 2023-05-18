package calculatorapp.calculator.operations;

import calculatorapp.calculator.AbstractCalculator;

public class Percent extends AbstractCalculator {
    public Percent(int number1, int number2) {
        percent(number1, number2);
    }

    protected static void percent(int number1, int number2) {
        if (number2 != 0)
        {
            cal = number1 % number2;
        } else
        {
            flag = true;
        }
    }
}