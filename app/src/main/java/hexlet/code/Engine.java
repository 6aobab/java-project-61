package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static int COUNT_TO_WIN = 3;
    public static String scanName(Scanner scanner, int gameNum, String question) {
        System.out.println("Your choice: " + gameNum);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String incomingName = scanner.next();
        System.out.println("Hello, " + incomingName + "!");
        System.out.println(question);

        return incomingName;
    }


}
