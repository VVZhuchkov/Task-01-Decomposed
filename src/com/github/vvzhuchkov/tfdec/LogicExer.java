package com.github.vvzhuchkov.tfdec;

public class LogicExer {

    public static boolean checkSumDigits(int number) {
        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number % 100 / 10;
        int fourth = number % 1000 % 100 % 10;
        boolean checkAnswer = (first + second) == (third + fourth);
        return checkAnswer;
    }

    public static int sumMinMax(int[] mass) {
        int sum;
        int min = mass[0];
        int max = mass[0];
        for (int j : mass) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        sum = min + max;
        return sum;
    }

    public static int[][] constructMatrix(int size) {
        int[][] mass = new int[size][size];
        for (int i = 0; i < size; i = i + 2) {
            for (int j = 0; j < size; j++) {
                mass[i][j] = j + 1;
                mass[size - i - 1][size - j - 1] = j + 1;
            }
        }
        return mass;
    }
}
