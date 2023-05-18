package calculatorapp.calculator.operations;


import calculatorapp.calculator.AbstractCalculator;

public class Minus extends AbstractCalculator {
    public Minus(int number1, int number2) {
        minus(number1, number2);
    }

    private static void minus(int number1, int number2) {
        cal = number1 - number2;
    }
}
