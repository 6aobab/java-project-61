package hexlet.code.games;

import java.util.Scanner;

public class Greetings {
    public static void great() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: 1");
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String incomingName = scanner.next();
        System.out.println("Hello, " + incomingName + "!");
        scanner.close();
    }
}
