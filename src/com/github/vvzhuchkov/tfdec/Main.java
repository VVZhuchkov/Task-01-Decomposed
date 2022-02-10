package com.github.vvzhuchkov.tfdec;

public class Main {
    public static void main(String[] args) {
        int number = InputDataExer.checkFourDigitsNumber();
        String answer = LogicExer.checkSumDigits(number);
        OutputDataExer.outputSumOfFourDigitsNumber(number, answer);

        int sumMinMax = LogicExer.sumMinMax();
        OutputDataExer.outputSumMinMax(sumMinMax);

        int size = InputDataExer.checkSizeMatrix();
        int[][] matrix = LogicExer.constructMatrix(size);
        OutputDataExer.outputMatrix(size, matrix);
    }
}
