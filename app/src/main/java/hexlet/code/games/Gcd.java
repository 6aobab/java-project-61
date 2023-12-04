package hexlet.code.games;

import hexlet.code.main.Engine;

public class Gcd {
    public static final String RULES = "Find the greatest common divisor of given numbers.";
    public static final int OPTIONS = 2;
    public static final int FACTOR_FOR_NUMBER = 100;

    public static void findGreatest() {
        String[][] questionAnswer = new String[Engine.COUNT][OPTIONS];
        for (int i = 0; i < Engine.COUNT; i++) {
            int firstNumber = (int) (Math.random() * FACTOR_FOR_NUMBER);
            int secondNumber = (int) (Math.random() * FACTOR_FOR_NUMBER);
            String question = firstNumber + " " + secondNumber;
            String correctAnswer = String.valueOf(gcdFind(firstNumber, secondNumber));
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = correctAnswer;
        }
        Engine.countThreeRounds(questionAnswer, RULES);
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
}
