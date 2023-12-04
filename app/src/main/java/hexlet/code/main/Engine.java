package hexlet.code.main;

import java.util.Scanner;

public class Engine {
    public static final int COUNT = 3;

    public static void countThreeRounds(String[][] questionAnswer, String rule) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String incomingName = scanner.nextLine();
        System.out.println("Hello, " + incomingName + "!");
        System.out.println(rule);
        for (int i = 0; i < COUNT; i++) {
            String question = questionAnswer[i][0];
            String rightAnswer = questionAnswer[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(questionAnswer[i][1])) {
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
