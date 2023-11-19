package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    private static final int fountForRandomNumber = 100;

    public static void primeProcess() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 6, "Answer 'yes' if given number is prime."
                + " Otherwise answer 'no'.");
        int countToWin = 3;
        do {

            int randomNumber = (int) (Math.random() * fountForRandomNumber);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String incomingAnswer = scanner.next();
            if (isSimple(randomNumber) && incomingAnswer.equals("yes")) {
                System.out.println("Correct!");
                countToWin--;
            } else if (!isSimple(randomNumber) && incomingAnswer.equals("no")) {
                System.out.println("Correct!");
                countToWin--;
            } else if (isSimple(randomNumber) && incomingAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                        + incomingName + "!");
                break;
            } else if (!isSimple(randomNumber) && incomingAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, "
                        + incomingName + "!");
                break;
            }
            if (countToWin == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (countToWin > 0);
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
