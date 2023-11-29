package hexlet.code;

import hexlet.code.Main.Greetings;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) { openMenu();
    }
    public static void openMenu() {
        System.out.println("""
                Please enter the game number and press Enter\s
                1 - Greet\s
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        chooseGame();
    }
    public static void chooseGame() {
        Scanner scanner = new Scanner(System.in);
        String incomingText = scanner.next();
        switch (incomingText) {
            case "1" -> Greetings.great();
            case "2" -> Even.checkEven();
            case "3" -> Calculator.calculateExpression();
            case "4" -> Gcd.findGreatest();
            case "5" -> Progression.printAp();
            case "6" -> Prime.findPrime();
            default -> System.out.println("Write number from 1 to 6!");
        }
    }
}
