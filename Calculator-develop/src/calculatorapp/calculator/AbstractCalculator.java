package calculatorapp.calculator;

import calculatorapp.calculator.operations.*;

import static calculatorapp.utils.TextConstants.ERROR_BINARY;
import static calculatorapp.utils.TextConstants.ERROR_OCTAL;
import static calculatorapp.utils.TextConstants.ERROR_DECIMAL;
import static calculatorapp.utils.TextConstants.ERROR_HEHADECIMAL;
import static calculatorapp.utils.TextConstants.ERROR_SPLIT_BY_0;


public class AbstractCalculator {
    public static boolean  flag = true;
    protected static int cal = 0;

    private static final String BINARY = "[01]+";
    private static final String OCTAL = "[0-7]+";
    private static final String DECIMAL = "[0-9]+";
    private static final String HEXADECIMAL = "[0-9a-f]+";



    private static int binaryToDecimal(String binary) {return Integer.parseInt(binary, 2);}

    private static int octalToDecimal(String octal) {return Integer.parseInt(octal, 8);}

    private static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    private static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    private static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    private static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal);
    }

    private static int calculate(int number1, int number2, int choice_operation) {

        switch (choice_operation) {
            case 1:
                new Plus(number1, number2);
                break;

            case 2:
                new Minus(number1, number2);
                break;
            case 3:
                new Split(number1, number2);
                break;
            case 4:
                new Multiply(number1, number2);
                break;
            case 5:
                new Percent(number1, number2);
                break;
        }
        return cal;
    }

    public void outputBinary(String number1, String number2, int choice_operation) {
        if (number1.matches(BINARY) && number2.matches(BINARY))
        {
            calculate(binaryToDecimal(number1),binaryToDecimal(number2),choice_operation);
            if (flag)
            {
                System.out.println("---ОТВЕТ---" +
                        "\nБинарный: " + decimalToBinary(calculate(binaryToDecimal(number1),binaryToDecimal(number2),choice_operation)) +
                        "\nВосьмеричный: " + decimalToOctal(calculate(binaryToDecimal(number1),binaryToDecimal(number2),choice_operation)) +
                        "\nДесятичный: " + calculate(binaryToDecimal(number1),binaryToDecimal(number2),choice_operation) +
                        "\nШестнадцатеричный: " + decimalToHex(calculate(binaryToDecimal(number1),binaryToDecimal(number2),choice_operation)));
            } else
            {
                System.out.println(ERROR_SPLIT_BY_0);
                flag = false;
            }
        } else
        {
            System.out.println(ERROR_BINARY);
        }
    }
    public void outputOctal(String number1, String number2, int choice_operation) {
        if (number1.matches(OCTAL) && number2.matches(OCTAL))
        {
            calculate(octalToDecimal(number1),octalToDecimal(number2),choice_operation);
            if (flag) {
                System.out.println("---ОТВЕТ---" +
                        "\nБинарный: " + decimalToBinary(calculate(octalToDecimal(number1), octalToDecimal(number2), choice_operation)) +
                        "\nВосьмеричный: " + decimalToOctal(calculate(octalToDecimal(number1), octalToDecimal(number2), choice_operation)) +
                        "\nДесятичный: " + calculate(octalToDecimal(number1), octalToDecimal(number2), choice_operation) +
                        "\nШестнадцатеричный: " + decimalToHex(calculate(octalToDecimal(number1), octalToDecimal(number2), choice_operation)));
            } else
            {
                System.out.println(ERROR_SPLIT_BY_0);
                flag = false;
            }
        } else
        {
            System.out.println(ERROR_OCTAL);
        }
    }
    public void outputDecimal(String number1, String number2, int choice_operation) {
        if (number1.matches(DECIMAL) && number2.matches(DECIMAL))
        {
            calculate(Integer.parseInt(number1),Integer.parseInt(number2),choice_operation);
            if (flag) {
                System.out.println("---ОТВЕТ---" +
                        "\nБинарный: " + decimalToBinary(calculate(Integer.parseInt(number1), Integer.parseInt(number2), choice_operation)) +
                        "\nВосьмеричный: " + decimalToOctal(calculate(Integer.parseInt(number1), Integer.parseInt(number2), choice_operation)) +
                        "\nДесятичный: " + calculate(Integer.parseInt(number1), Integer.parseInt(number2), choice_operation) +
                        "\nШестнадцатеричный: " + decimalToHex(calculate(Integer.parseInt(number1), Integer.parseInt(number2), choice_operation)));
            } else
            {
                System.out.println(ERROR_SPLIT_BY_0);
                flag = false;
            }
        } else
        {
            System.out.println(ERROR_DECIMAL);
        }
    }
    public void outputHexadecimal(String number1, String number2, int choice_operation) {
        if (number1.matches(HEXADECIMAL) && number2.matches(HEXADECIMAL))
        {
            calculate(hexToDecimal(number1),hexToDecimal(number2),choice_operation);
            if (flag) {
                System.out.println("---ОТВЕТ---" +
                        "\nБинарный: " + decimalToBinary(calculate(hexToDecimal(number1), hexToDecimal(number2), choice_operation)) +
                        "\nВосьмеричный: " + decimalToOctal(calculate(hexToDecimal(number1), hexToDecimal(number2), choice_operation)) +
                        "\nДесятичный: " + calculate(hexToDecimal(number1), hexToDecimal(number2), choice_operation) +
                        "\nШестнадцатеричный: " + decimalToHex(calculate(hexToDecimal(number1), hexToDecimal(number2), choice_operation)));
            } else
            {
                System.out.println(ERROR_SPLIT_BY_0);
                flag = false;
            }
        } else
        {
            System.out.println(ERROR_HEHADECIMAL);
        }
    }
}
