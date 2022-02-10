package com.github.vvzhuchkov;

import java.util.Scanner;

public class InputData {

    public static int getInputNumber() {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Некорректный ввод! Попробуйте снова.");
            scanner.nextLine();
        }
        number = scanner.nextInt();
        return number;
    }

    public static int checkFourDigitsNumber() {
        System.out.print("Введите положительное четырехзначное число: ");
        int number = getInputNumber();
        while (number < 1000 || number > 9999) {
            System.out.println("Ваше число не четырехзначное! Попробуйте снова.");
            System.out.print("Введите положительное четырехзначное число: ");
            number = getInputNumber();
        }
        return number;
    }

    public static int checkSizeMatrix() {
        System.out.print("Введите размер стороны равносторонней двумерной матрицы (четное положительное число): ");
        int size = InputData.getInputNumber();
        while (size % 2 != 0 || size <= 0) {
            System.out.println("Необходимо ввести четное положительное число! Попробуйте снова.");
            System.out.print("Введите размер стороны равносторонней двумерной матрицы (четное положительное число): ");
            size = getInputNumber();
        }
        return size;
    }
}
