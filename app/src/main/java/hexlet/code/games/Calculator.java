package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private static final int gameNum = 3;
    private static final int numberOfOperations = 3;
    private static int randomOperator;
    private static final int factorForRandomNumber = 100;
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner,  gameNum, "What is the result of the expression?");

        do {
            int firstRandomNumber = (int) (Math.random() * factorForRandomNumber);
            int secondRandomNumber = (int) (Math.random() * factorForRandomNumber);
            String sign = generateOperator();
            System.out.println("Question: " + firstRandomNumber + " " + sign + " " + secondRandomNumber);
            int result = switch (sign) {
                case "+" -> firstRandomNumber + secondRandomNumber;
                case "*" -> firstRandomNumber * secondRandomNumber;
                case "-" -> firstRandomNumber - secondRandomNumber;
                default -> 0;
            };

            System.out.print("Your answer: ");
            int incomingNumber = scanner.nextInt();
            if (incomingNumber == result) {
                System.out.println("Correct!");
                Engine.COUNT_TO_WIN--;
            } else {
                System.out.println("'" + incomingNumber + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (Engine.COUNT_TO_WIN == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (Engine.COUNT_TO_WIN > 0);
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        randomOperator = random.nextInt(numberOfOperations);
        return operators[randomOperator];
    }
}
