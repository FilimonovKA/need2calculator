package calculatorapp.calculator.operations;


import calculatorapp.calculator.AbstractCalculator;

public class Multiply extends AbstractCalculator {
    public Multiply(int number1, int number2) {
        multiply(number1, number2);
    }

    protected static void multiply(int number1, int number2) {
        cal = number1 * number2;
    }
}