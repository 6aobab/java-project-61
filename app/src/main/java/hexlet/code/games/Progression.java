package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;


public class Progression {
    public static void doProgression() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner, 5, "What number is missing in the "
                + "progression?");
        int count = 3;
        do {
            int startNum = getRandomValue(1, 10);
            int endNum = getRandomValue(20, 99);
            int step = getRandomValue(2, 4);
            int foundNum = printAP(startNum, endNum, step);
            System.out.println("\nYour answer: ");
            int incomingProgression = scanner.nextInt();
            if (incomingProgression == foundNum) {
                System.out.println("Correct!");
                count--;
            } else {
                System.out.println("'" + incomingProgression + "' is wrong answer ;(. Correct answer was '" + foundNum
                        + "'\nLet's try again " + incomingName + "!");
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }

    public static int printAP(int start, int end, int step) {
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

    private static int getRandomValue(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
