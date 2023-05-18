package calculatorapp.calculator.operations;

import calculatorapp.calculator.AbstractCalculator;

public class Plus extends AbstractCalculator {
    public Plus(int number1, int number2) {
        plus(number1, number2);
    }

    private static void plus(int number1, int number2) {
        cal = number1 + number2;
    }
}
