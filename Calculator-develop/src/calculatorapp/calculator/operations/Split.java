package calculatorapp.calculator.operations;

import calculatorapp.calculator.AbstractCalculator;

public class Split extends AbstractCalculator {
    public Split(int number1, int number2) {
        split(number1, number2);
    }

    protected static void split(int number1, int number2) {
        if (number2 != 0)
        {
            cal = number1 / number2;
        } else
        {
            flag = true;
        }
    }
}