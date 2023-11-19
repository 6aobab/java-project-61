package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static int countToWin = 3;
    public static final int factorForRandomNumber = 100;
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 3, "What is the result of the expression?");

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
                countToWin--;
            } else {
                System.out.println("'" + incomingNumber + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (countToWin == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (countToWin > 0);
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        int randomOperator = random.nextInt(3);
        return operators[randomOperator];
    }
}
