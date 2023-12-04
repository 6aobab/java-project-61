package hexlet.code.games;

import hexlet.code.main.Engine;

import java.util.Random;

public class Calculator {
    public static final String RULES = "What is the result of the expression?";
    public static final int OPTIONS = 2;
    public static final String[] OPERATORS = {"+", "-", "*"};
    public static final int FACTOR_FOR_NUMBER = 100;

    public static void calculateExpression() {
        String[][] questionAnswer = new String[Engine.COUNT][OPTIONS];
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT; i++) {
            int firstNumber =  (int) (Math.random() * FACTOR_FOR_NUMBER);
            int secondNumber = (int) (Math.random() * FACTOR_FOR_NUMBER);
            String operator = OPERATORS[random.nextInt(OPERATORS.length)];
            String question = firstNumber + " " + operator + " " + secondNumber;
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = String.valueOf(calculate(firstNumber, secondNumber, operator));
        }
        Engine.countThreeRounds(questionAnswer, RULES);
    }

    private static int calculate(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new Error("Unknown operator :(");
        };
    }
}
