package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    private static final int FACTOR_FOR_NUMBER = 100;
    private static final int NUMGAME = 6;

    public static void primeProcess() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, NUMGAME, "Answer 'yes' if given number is prime."
                + " Otherwise answer 'no'.");
        int count = Engine.getCount();
        do {
            checkSimple(scanner, count, incomingName);
        } while (count > 0);
    }

    public static int checkSimple(Scanner scanner, int count, String incomingName) {
        int randomNumber = (int) (Math.random() * FACTOR_FOR_NUMBER);
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
            count = 0;
        } else if (!isSimple(randomNumber) && incomingAnswer.equals("yes")) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, "
                    + incomingName + "!");
            count = 0;
        }
        if (count == 0) {
            System.out.println("Congratulations, " + incomingName + "!");
        }
        return count;
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
