package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void findGreatest() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 4, "Find the greatest common divisor of "
                + "given numbers.");

        int countToWin = 3;
        do {
            int firstNum = (int) (Math.random() * 100);
            if (firstNum == 0) {
                firstNum = firstNum + 1;
            }
            int secondNum = (int) (Math.random() * 100);
            if (secondNum == 0) {
                secondNum = secondNum + 1;
            }
            System.out.println("Question: " + firstNum + " " + secondNum);
            int result = gcd(firstNum, secondNum);
            System.out.print("Your answer: ");
            int incomingGCD = scanner.nextInt();
            if (incomingGCD == result) {
                System.out.println("Correct!");
                countToWin--;
            } else {
                System.out.println("'" + incomingGCD + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (countToWin == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (countToWin > 0);
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
