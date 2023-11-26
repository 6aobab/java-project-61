package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    private static final int FACTOR_FOR_NUMBER = 100;
    private static final int NUMGAME = 6;

    public static void findPrime() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, NUMGAME, "Answer 'yes' if given number is prime."
                + " Otherwise answer 'no'.");
        int count = Engine.getCount();
        Engine.prime(FACTOR_FOR_NUMBER, scanner, count, incomingName);
    }

}
