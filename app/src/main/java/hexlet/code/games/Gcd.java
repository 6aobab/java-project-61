package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    private static final int FACTOR_FOR_NUMBER = 100;
    public static void findGreatest() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 4, "Find the greatest common divisor of "
                + "given numbers.");

        do {
            int firstNum = (int) (Math.random() * FACTOR_FOR_NUMBER);
            if (firstNum == 0) {
                firstNum = firstNum + 1;
            }
            int secondNum = (int) (Math.random() * FACTOR_FOR_NUMBER);
            if (secondNum == 0) {
                secondNum = secondNum + 1;
            }
            System.out.println("Question: " + firstNum + " " + secondNum);
            int result = gcd(firstNum, secondNum);
            System.out.print("Your answer: ");
            int incomingGCD = scanner.nextInt();
            if (incomingGCD == result) {
                System.out.println("Correct!");
                Engine.COUNT--;
            } else {
                System.out.println("'" + incomingGCD + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (Engine.COUNT == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (Engine.COUNT > 0);
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
