package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    private static final int FACTOR_FOR_NUMBER = 100;
    private static final int NUMGAME = 2;
    public static void checkEven() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, NUMGAME, "Answer 'yes' if the number is even, "
                + "otherwise " + "answer 'no'.");
        int count = Engine.getCount();
        Engine.even(scanner, FACTOR_FOR_NUMBER, count, incomingName);
    }
}
