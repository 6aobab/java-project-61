package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private static final int NUMGAME = 3;
    private static final int NUM_OF_OPERATIONS = 3;
    private static int OPERATOR;
    private static final int FACTOR_FOR_NUMBER = 100;
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner,  NUMGAME, "What is the result of the expression?");

        do {
            int firstRandomNumber = (int) (Math.random() * FACTOR_FOR_NUMBER);
            int secondRandomNumber = (int) (Math.random() * FACTOR_FOR_NUMBER);
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
                Engine.COUNT--;
            } else {
                System.out.println("'" + incomingNumber + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (Engine.COUNT == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (Engine.COUNT > 0);
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        OPERATOR = random.nextInt(NUM_OF_OPERATIONS);
        return operators[OPERATOR];
    }
}
