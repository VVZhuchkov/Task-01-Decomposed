package com.github.vvzhuchkov;

public class Logic {

    public static String checkSumDigits(int number) {
        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number % 100 / 10;
        int fourth = number % 1000 % 100 % 10;
        boolean checkAnswer = (first + second) == (third + fourth);
        return getRuAnswer(checkAnswer);
    }

    public static String getRuAnswer(boolean answer) {
        return (answer ? "Равна" : "Не равна");
    }

    public static int sumMinMax() {
        System.out.print("Введите первое число = ");
        int first = InputData.getInputNumber();
        System.out.print("Введите второе число = ");
        int second = InputData.getInputNumber();
        System.out.print("Введите третье число = ");
        int third = InputData.getInputNumber();
        int sum;
        int[] mass = new int[]{first, second, third};
        int min = first;
        int max = first;
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
