package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void checkEven() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 2, "Answer 'yes' if the number is even, "
                + "otherwise " + "answer 'no'.");
        int count = 3;
        do {
            int factor = 100;
            int randomNumber = (int) (Math.random() * factor);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String incomingAnswer = scanner.next();
            if (incomingAnswer.equals("yes") && (randomNumber % 2 == 0)) {
                System.out.println("Correct!");
                count--;
            } else if (incomingAnswer.equals("no") && (randomNumber % 2 != 0)) {
                System.out.println("Correct!");
                count--;
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
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }
}
