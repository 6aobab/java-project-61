package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 3, "What is the result of the expression?");
        int count = 3;
        do {
            int factor = 100;
            int b = (int) (Math.random() * factor);
            int c = (int) (Math.random() * factor);
            String sign = generateOperator();
            System.out.println("Question: " + b + " " + sign + " " + c);
            int result = switch (sign) {
                case "+" -> b + c;
                case "*" -> b * c;
                case "-" -> b - c;
                default -> 0;
            };

            System.out.print("Your answer: ");
            int incomingNumber = scanner.nextInt();
            if (incomingNumber == result) {
                System.out.println("Correct!");
                count--;
            } else {
                System.out.println("'" + incomingNumber + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again " + incomingName);
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        int randomOperator = random.nextInt(3);
        return operators[randomOperator];
    }
}
