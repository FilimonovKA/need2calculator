package calculatorapp;

import calculatorapp.calculator.AbstractCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import static calculatorapp.utils.TextConstants.*;

public class CalculatorApp {
    private AbstractCalculator calculator = new AbstractCalculator();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println(MAIN_MENU_1);
            int choiceType;
            try {
                choiceType = scanner.nextInt();
                if (choiceType == 0) {
                    return;
                } else if (choiceType < 1 || choiceType > 4) {
                    System.out.println(ERROR_CHOICE_TYPE_1);
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println(ERROR_CHOICE_TYPE_2);
                scanner.nextLine();
                continue;
            }

            System.out.println(MAIN_MENU_2);
            int choiceOperation;
            try {
                choiceOperation = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(ERROR_CHOICE_OPERATIONS);
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();

            System.out.print(ENTER_1);
            String number1 = scanner.nextLine();

            System.out.print(ENTER_2);
            String number2 = scanner.nextLine();

            try {
                switch (choiceType) {
                    case 1 -> calculator.outputBinary(number1, number2, choiceOperation);
                    case 2 -> calculator.outputOctal(number1, number2, choiceOperation);
                    case 3 -> calculator.outputDecimal(number1, number2, choiceOperation);
                    case 4 -> calculator.outputHexadecimal(number1, number2, choiceOperation);
                    default -> System.out.println(ERROR_OUTPUT_1);
                }
            } catch (NumberFormatException e) {
                System.out.println(ERROR_OUTPUT_2);
            }
        }
    }
}

