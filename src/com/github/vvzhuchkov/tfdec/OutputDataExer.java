package com.github.vvzhuchkov.tfdec;

public class OutputDataExer {

    public static void outputSumOfFourDigitsNumber(int number, boolean answer) {
        System.out.println("Entered 4-digit number - " + number);
        System.out.println("Do the sum of the first 2 digits equal the sum of the last 2 digits?\n" + answer);
        System.out.println("\n---------------------------------------------------------\n");
    }

    public static void outputSumMinMax(int sum) {
        System.out.println("Sum min and max numbers are equal: " + sum);
        System.out.println("\n---------------------------------------------------------\n");
    }

    public static void outputMatrix(int size, int[][] mass) {
        System.out.println("Target matrix if n = " + size + ":");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n---------------------------------------------------------\n");
    }
}