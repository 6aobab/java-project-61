package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;


public class Progression {
    private static final int MINSTART = 1;
    private static final int MAXSTART = 10;
    private static final int MINEND = 20;
    private static final int MAXEND = 90;
    private static final int MINSTEP = 2;
    private static final int MAXSTEP = 4;
    private static final int NUMGAME = 5;
    public static void doProgression() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, NUMGAME, "What number is missing in the "
                + "progression?");
        int count = Engine.getCount();
        int startNumOfProgression = getRandomValue(MINSTART, MAXSTART);
        int endNumOfProgression = getRandomValue(MINEND, MAXEND);
        int stepOfProgression = getRandomValue(MINSTEP, MAXSTEP);
        int foundNum = printAP(startNumOfProgression, endNumOfProgression, stepOfProgression);
        Engine.progression(scanner, foundNum, count, incomingName);
    }

    public static int printAP(int start, int end, int step) {
        System.out.print("Question: ");
        int foundNum = 0;
        int randomIndex = (int) (Math.random() * ((end - start) / step + 1));
        for (int i = start, currentIndex = 0; i <= end; i += step) {
            if (currentIndex == randomIndex) {
                System.out.print(".. ");
                foundNum = i;
            } else {
                System.out.print(i + " ");
            }
            currentIndex++;

        }
        return foundNum;
    }

    private static int getRandomValue(int minNumber, int maxNumber) {
        return (int) (Math.random() * (maxNumber - minNumber + 1)) + minNumber;
    }
}
