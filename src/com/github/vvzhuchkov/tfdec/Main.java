package com.github.vvzhuchkov.tfdec;

public class Main {
    public static void main(String[] args) {
        int number = InputDataExer.checkFourDigitsNumber();
        boolean answer = LogicExer.checkSumDigits(number);
        OutputDataExer.outputSumOfFourDigitsNumber(number, answer);

        int[] mass = InputDataExer.threeParams();
        int sumMinMax = LogicExer.sumMinMax(mass);
        OutputDataExer.outputSumMinMax(sumMinMax);

        int size = InputDataExer.checkSizeMatrix();
        int[][] matrix = LogicExer.constructMatrix(size);
        OutputDataExer.outputMatrix(size, matrix);
    }
}
