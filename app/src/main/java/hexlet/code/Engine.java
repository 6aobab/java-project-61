package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String scanName(Scanner scanner, int gameNum, String question) {
        System.out.println("Your choice: " + gameNum);
        System.out.println("Welcome to the Brain Games!\nMay i have your name?");
        String incomingName = scanner.next();
        System.out.println("Hello, " + incomingName + "!");
        System.out.println(question);

        return incomingName;
    }

}
