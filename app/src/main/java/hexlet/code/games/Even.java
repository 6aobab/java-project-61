package hexlet.code.games;

import hexlet.code.Main.Engine;

public class Even {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int OPTIONS = 2;
    public static final int FACTOR_FOR_NUMBER = 100;
    public static void checkEven() {
        var conditionAnswer = new String[Engine.COUNT][OPTIONS];
        for (int i = 0; i < Engine.COUNT; i++) {
            int number = (int) (Math.random() * FACTOR_FOR_NUMBER);
            String correctAnswer = isEven(number) ? "yes" : "no";
            conditionAnswer[i][0] = String.valueOf(number);
            conditionAnswer[i][1] = correctAnswer;
        }
        Engine.countThreeRounds(conditionAnswer, RULES);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
