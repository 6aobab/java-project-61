package hexlet.code.games;

import hexlet.code.Main.Engine;

import java.util.Random;


public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    public static final int OPTIONS = 2;
    public static final int MINLENGTH = 5;
    public static final int MAXLENGTH = 10;
    public static final int MAXSTEP = 5;
    public static final int MAXSTART = 20;

    public static void printAp() {
        String[][] conditionAnswer = new String[Engine.COUNT][OPTIONS];
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT; i++) {
            int startNumber = random.nextInt(MAXSTART) + 1;
            int progressionLength = MINLENGTH + random.nextInt(MAXLENGTH - MINLENGTH + 1);
            int step = random.nextInt(MAXSTEP) + 2;
            int replacement = random.nextInt(progressionLength);
            var progressionParts = doProgression(startNumber, step, progressionLength);
            conditionAnswer[i][1] = progressionParts[replacement];
            progressionParts[replacement] = "..";
            conditionAnswer[i][0] = String.join(" ", progressionParts);
        }
        Engine.countThreeRounds(conditionAnswer, RULES);
    }
    private static String[] doProgression(int startNumber, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progression[i] = String.valueOf(startNumber);
            startNumber = startNumber + step;
        }
        return progression;
    }
}
