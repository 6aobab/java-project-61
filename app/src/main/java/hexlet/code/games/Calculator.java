package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private static final int NUMGAME = 3;
    private static final int NUM_OF_OPERATIONS = 3;
    private static int operator;
    private static final int FACTOR_FOR_NUMBER = 100;
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        String incomingName = Engine.scanName(scanner,  NUMGAME, "What is the result of the expression?");
        int count = Engine.getCount();
        String sign = generateOperator();
        Engine.calculator(scanner, sign, FACTOR_FOR_NUMBER, count, incomingName);
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        operator = random.nextInt(NUM_OF_OPERATIONS);
        return operators[operator];
    }
}
