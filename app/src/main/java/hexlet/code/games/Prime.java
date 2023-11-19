package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    public static void primeProcess() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 6, "Answer 'yes' if given number is prime."
                + " Otherwise answer 'no'.");
        int count = 3;
        do {
            int a = 100;
            int randomNumber = (int) (Math.random() * a);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String incomingAnswer = scanner.next();
            if (isSimple(randomNumber) && incomingAnswer.equals("yes")) {
                System.out.println("Correct!");
                count--;
            } else if (!isSimple(randomNumber) && incomingAnswer.equals("no")) {
                System.out.println("Correct!");
                count--;
            } else if (isSimple(randomNumber) && incomingAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                        + incomingName + "!");
                break;
            } else if (!isSimple(randomNumber) && incomingAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, "
                        + incomingName + "!");
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }

    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
