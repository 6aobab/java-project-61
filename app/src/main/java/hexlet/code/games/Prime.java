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
        Engine.prime(FACTOR_FOR_NUMBER, scanner, count, incomingName);
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
