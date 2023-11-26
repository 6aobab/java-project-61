package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int COUNT = 3;

    public static String scanName(Scanner scanner, int gameNum, String question) {
        System.out.println("Your choice: " + gameNum);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String incomingName = scanner.next();
        System.out.println("Hello, " + incomingName + "!");
        System.out.println(question);

        return incomingName;
    }

    public static int getCount() {

        return COUNT;
    }

    public static void even(Scanner scanner, int factor, int count, String incomingName) {
        do {
            int randomNumber = (int) (Math.random() * factor);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String incomingAnswer = scanner.next();
            if (incomingAnswer.equals("yes") && (randomNumber % 2 == 0)) {
                System.out.println("Correct!");
                count--;
            } else if (incomingAnswer.equals("no") && (randomNumber % 2 != 0)) {
                System.out.println("Correct!");
                count--;
            } else if (incomingAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, "
                        + incomingName + "!");
                break;
            } else if (incomingAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                        + incomingName + "!");
                break;
            } else {
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }

    public static void calculator(Scanner scanner, String sign, int factor, int count, String incomingName) {
        do {
            int firstRandomNumber = (int) (Math.random() * factor);
            int secondRandomNumber = (int) (Math.random() * factor);
            System.out.println("Question: " + firstRandomNumber + " " + sign + " " + secondRandomNumber);
            int result = switch (sign) {
                case "+" -> firstRandomNumber + secondRandomNumber;
                case "*" -> firstRandomNumber * secondRandomNumber;
                case "-" -> firstRandomNumber - secondRandomNumber;
                default -> 0;
            };
            System.out.print("Your answer: ");
            int incomingNumber = scanner.nextInt();
            if (incomingNumber == result) {
                System.out.println("Correct!");
                count--;
            } else {
                System.out.println("'" + incomingNumber + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }

    public static void gcd(int firstNum, int secondNum, int result, Scanner scanner, int count, String incomingName) {
        do {
            System.out.println("Question: " + firstNum + " " + secondNum);
            System.out.print("Your answer: ");
            int incomingGCD = scanner.nextInt();
            if (incomingGCD == result) {
                System.out.println("Correct!");
                count--;
            } else {
                System.out.println("'" + incomingGCD + "' is wrong answer ;(. Correct answer was '" + result
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }

    public static void prime(int factor, Scanner scanner, int count, String incomingName) {
        do {
            int randomNumber = (int) (Math.random() * factor);
            System.out.println("Question: " + randomNumber + "\nYour answer: ");
            String incomingAnswer = scanner.next();
            if (isSimple(randomNumber) && incomingAnswer.equals("yes")) {
                System.out.println("Correct!");
                count--;
            } else if (!isSimple(randomNumber) && incomingAnswer.equals("no")) {
                System.out.println("Correct!");
                count--;
            } else if (isSimple(randomNumber) && incomingAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, "
                        + incomingName + "!");
                break;
            } else if (!isSimple(randomNumber) && incomingAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, "
                        + incomingName + "!");
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }

    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void progression(Scanner scanner, int foundNum, int count, String incomingName) {
        do {
            System.out.print("\nYour answer: ");
            int incomingProgression = scanner.nextInt();
            if (incomingProgression == foundNum) {
                System.out.println("Correct!");
                count--;
            } else {
                System.out.println("'" + incomingProgression + "' is wrong answer ;(. Correct answer was '" + foundNum
                        + "'\nLet's try again, " + incomingName + "!");
                break;
            }
            if (count == 0) {
                System.out.println("Congratulations, " + incomingName + "!");
            }
        } while (count > 0);
    }
}
