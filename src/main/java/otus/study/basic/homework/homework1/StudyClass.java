package otus.study.basic.homework.homework1;

import java.util.Random;
import java.util.Scanner;

public class StudyClass {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt() % 1000;
        int b = rand.nextInt() % 1000;
        int c = rand.nextInt() % 1000;
        int colorData = rand.nextInt() % 31;
        boolean increment = rand.nextBoolean();

        System.out.println("Please input a number between 1 and 5. Each number represents a method to be called:");
        System.out.println("1 - greetings");
        System.out.println("2 - checkSign");
        System.out.println("3 - selectColor");
        System.out.println("4 - compareNumbers");
        System.out.println("5 - addOrSubtractAndPrint");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1) {
            greetings();
        } else if (input == 2) {
            checkSign(a, b, c);
        } else if (input == 3) {
            selectColor(colorData);
        } else if (input == 4) {
            compareNumbers(a, b);
        } else if (input == 5) {
            addOrSubtractAndPrint(a, b, increment);
        }
    }

    private static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    private static void checkSign(int a, int b, int c) {
        System.out.println("Numbers: a = " + a + ", b = " + b + ", c = " + c);
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void selectColor(int data) {
        System.out.println("data = " + data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int a, int b) {
        System.out.println("Numbers: a = " + a + ", b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("Numbers: initValue = " + initValue + ", delta = " + delta + ", increment = " + increment);
        if (increment) {
            System.out.println("Sum: " + initValue + " + " + delta + " = " + (initValue + delta));
        } else {
            System.out.println("Sum: " + initValue + " - " + delta + " = " + (initValue - delta));
        }
    }
}
