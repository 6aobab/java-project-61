package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;


public class Progression {
    private static final int minStartNumOfProgression = 1;
    private static final int maxStartNimOfProgression = 10;
    private static final int minEndNumOfProgression = 20;
    private static final int maxEndNumOfProgression = 90;
    private static final int minStepOfProgression = 2;
    private static final int maxStepOfProgression = 4;
    private static final int NUMGAME = 5;

    public static void doProgression() {
        Scanner scanner = new Scanner(System.in);

        String incomingName = Engine.scanName(scanner, NUMGAME, "What number is missing in the "
                + "progression?");
        int count = Engine.getCount();
        do {
            int startNumOfProgression = getRandomValue(minStartNumOfProgression, maxStartNimOfProgression);
            int endNumOfProgression = getRandomValue(minEndNumOfProgression, maxEndNumOfProgression);
            int stepOfProgression = getRandomValue(minStepOfProgression, maxStepOfProgression);
            int foundNum = printAP(startNumOfProgression, endNumOfProgression, stepOfProgression);
            System.out.print("\nYour answer: ");
            int incomingProgression = scanner.nextInt();
            if (incomingProgression == foundNum) {
                System.out.println("Correct!");
                count--;
            } else {
                System.out.println("'" + incomingProgression + "' is wrong answer ;(. Correct answer was '" + foundNum
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
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
