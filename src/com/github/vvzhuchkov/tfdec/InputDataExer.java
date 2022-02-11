package com.github.vvzhuchkov.tfdec;

import java.util.Scanner;

public class InputDataExer {

    public static int getInputNumber() {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Incorrect input! Try again.");
            scanner.nextLine();
        }
        number = scanner.nextInt();
        return number;
    }

    public static int checkFourDigitsNumber() {
        System.out.print("Enter positive 4-digit number: ");
        int number = getInputNumber();
        while (number < 1000 || number > 9999) {
            System.out.println("Not 4-digit number! Try again.");
            System.out.print("Enter positive 4-digit number: ");
            number = getInputNumber();
        }
        return number;
    }

    public static int checkSizeMatrix() {
        System.out.print("Enter size of side equilateral two-dimensional array (positive even number): ");
        int size = InputDataExer.getInputNumber();
        while (size % 2 != 0 || size <= 0) {
            System.out.println("Positive even number only! Try again.");
            System.out.print("Enter size of side equilateral two-dimensional array (positive even number): ");
            size = getInputNumber();
        }
        return size;
    }

    public static int[] threeParams() {
        System.out.print("Enter first number = ");
        int first = getInputNumber();
        System.out.print("Enter second number = ");
        int second = getInputNumber();
        System.out.print("Enter third number = ");
        int third = getInputNumber();
        int[] mass = new int[]{first, second, third};
        return mass;
    }
}
