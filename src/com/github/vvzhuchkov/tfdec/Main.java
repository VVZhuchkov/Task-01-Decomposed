package com.github.vvzhuchkov.tfdec;

public class Main {
    public static void main(String[] args) {
        int number = InputData.checkFourDigitsNumber();
        String answer = Logic.checkSumDigits(number);
        OutputData.outputSumOfFourDigitsNumber(number, answer);

        int sumMinMax = Logic.sumMinMax();
        OutputData.outputSumMinMax(sumMinMax);

        int size = InputData.checkSizeMatrix();
        int[][] matrix = Logic.constructMatrix(size);
        OutputData.outputMatrix(size, matrix);
    }
}
