package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;


public class Progression {
    public static void doProgression() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 5, "What number is missing in the "
                + "progression?");
        int countToWin = 3;
        do {
            int minStartNumOfProgression = 1;
            int maxStartNimOfProgression = 10;
            int startNumOfProgression = getRandomValue(minStartNumOfProgression, maxStartNimOfProgression);
            int endNumOfProgression = getRandomValue(20, 90);
            int stepOfProgression = getRandomValue(2, 4);
            int foundNum = printAP(startNumOfProgression, endNumOfProgression, stepOfProgression);
            System.out.print("\nYour answer: ");
            int incomingProgression = scanner.nextInt();
            if (incomingProgression == foundNum) {
                System.out.println("Correct!");
                countToWin--;
            } else {
                System.out.println("'" + incomingProgression + "' is wrong answer ;(. Correct answer was '" + foundNum
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (countToWin == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (countToWin > 0);
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
