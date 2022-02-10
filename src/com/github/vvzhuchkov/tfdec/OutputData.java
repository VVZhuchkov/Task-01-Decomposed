package com.github.vvzhuchkov.tfdec;

public class OutputData {

    public static void outputSumOfFourDigitsNumber(int number, String answer) {
        System.out.println("Заданное четырехзначное число - " + number);
        System.out.println("Сумма двух первых цифр заданного четырехзначного числа " +
                "равна сумме двух его последних цифр?\n" + answer);
        System.out.println("\n---------------------------------------------------------\n");
    }

    public static void outputSumMinMax(int sum) {
        System.out.println("Сумма минимального и максимального числа равна: " + sum);
        System.out.println("\n---------------------------------------------------------\n");
    }

    public static void outputMatrix(int size, int[][] mass) {
        System.out.println("Целевая матрица при n = " + size + ":");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n---------------------------------------------------------\n");
    }
}