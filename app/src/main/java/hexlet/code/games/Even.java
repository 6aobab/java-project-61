package hexlet.code.games;

import hexlet.code.main.Engine;

public class Even {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int OPTIONS = 2;
    public static final int FACTOR_FOR_NUMBER = 100;

    public static void checkEven() {
        var questionAnswer = new String[Engine.COUNT][OPTIONS];
        for (int i = 0; i < Engine.COUNT; i++) {
            int number = (int) (Math.random() * FACTOR_FOR_NUMBER);
            String correctAnswer = isEven(number) ? "yes" : "no";
            questionAnswer[i][0] = String.valueOf(number);
            questionAnswer[i][1] = correctAnswer;
        }
        Engine.countThreeRounds(questionAnswer, RULES);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
