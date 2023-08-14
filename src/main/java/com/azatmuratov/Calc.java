package com.azatmuratov;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calc {

    public static String calc(String calc) throws Exception {

        String[] input = calc.split("");

        if (input.length != 3) {
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        byte a = Byte.parseByte(input[0]);
        byte b = Byte.parseByte(input[2]);
        char operator = input[1].charAt(0);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Числа от 1 до 10 включительно");
        }

        int result = switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new Exception("Не верный оператор");
        };

        return Integer.toString(result);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(calc(input));
    }
}

