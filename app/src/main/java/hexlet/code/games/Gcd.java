package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    private static final int FACTOR_FOR_NUMBER = 100;
    private static final int NUMGAME = 4;
    public static void findGreatest() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, NUMGAME, "Find the greatest common divisor of "
                + "given numbers.");
        int count = Engine.getCount();
        int firstNum = genNumber();
        int secondNum = genNumber();
        int result = gcdFind(firstNum, secondNum);
        Engine.gcd(firstNum, secondNum, result, scanner, count, incomingName);
    }

    public static int gcdFind(int a, int b) {
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

    public static int genNumber() {
        int num = (int) (Math.random() * FACTOR_FOR_NUMBER);
        if (num == 0) {
            num += 1;
        }
        return num;
    }
}
