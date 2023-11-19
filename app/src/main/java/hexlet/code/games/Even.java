package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    private static final int FACTOR_FOR_NUMBER = 100;
    public static void checkEven() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 2, "Answer 'yes' if the number is even, "
                + "otherwise " + "answer 'no'.");

        do {
            int randomNumber = (int) (Math.random() * FACTOR_FOR_NUMBER);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String incomingAnswer = scanner.next();
            if (incomingAnswer.equals("yes") && (randomNumber % 2 == 0)) {
                System.out.println("Correct!");
                Engine.COUNT--;
            } else if (incomingAnswer.equals("no") && (randomNumber % 2 != 0)) {
                System.out.println("Correct!");
                Engine.COUNT--;
            } else if (incomingAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, "
                        + incomingName + "!");
                break;
            } else if (incomingAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                        + incomingName + "!");
                break;
            } else {
                break;
            }
            if (Engine.COUNT == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (Engine.COUNT > 0);
    }
}
