package hexlet.code.games;

import hexlet.code.main.Engine;

public class Prime {
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int OPTIONS = 2;
    public static final int FACTOR_FOR_NUMBER = 100;

    public static void findPrime() {
        var questionAnswer = new String[Engine.COUNT][OPTIONS];
        for (int i = 0; i < Engine.COUNT; i++) {
            int randomNumber = (int) (Math.random() * FACTOR_FOR_NUMBER);
            String correctAnswer = isSimple(randomNumber) ? "yes" : "no";
            questionAnswer[i][0] = String.valueOf(randomNumber);
            questionAnswer[i][1] = correctAnswer;
        }
        Engine.countThreeRounds(questionAnswer, RULES);
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
