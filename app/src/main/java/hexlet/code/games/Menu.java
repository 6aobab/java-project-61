package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Menu {
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
            case "3" -> Calculator.calculate();
            case "4" -> Gcd.findGreatest();
            case "5" -> Progression.doProgression();
            case "6" -> Prime.primeProcess();
            default -> System.out.println("Write number from 1 to 6!");
        }
    }
}
