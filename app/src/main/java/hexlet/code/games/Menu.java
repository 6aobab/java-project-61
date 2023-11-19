package hexlet.code.games;

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
        if (incomingText.equals("1")) {
            Greetings.great();
        } else if (incomingText.equals("2")) {
            Even.checkEven();
        } else if (incomingText.equals("3")) {
            Calculator.calculate();
        } else if (incomingText.equals("4")) {
            Gcd.findGreatest();
        } else if (incomingText.equals("5")) {
            Progression.doProgression();
        } else if (incomingText.equals("6")) {
            Prime.primeProcess();
        }
    }
}
