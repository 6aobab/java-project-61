package hexlet.code.Main;

import java.util.Scanner;

public class Engine {
    public static final int COUNT = 3;
    public static void countThreeRounds(String[][] conditionAnswer, String rule) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String incomingName = scanner.nextLine();
        System.out.println("Hello, " + incomingName + "!");
        System.out.println(rule);
        for (int i = 0; i < COUNT; i++) {
            String question = conditionAnswer[i][0];
            String rightAnswer = conditionAnswer[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(conditionAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!%n",
                        answer,
                        rightAnswer,
                        incomingName);
                return;
            }
        }
        System.out.println("Congratulations, " + incomingName + "!");
    }
}
