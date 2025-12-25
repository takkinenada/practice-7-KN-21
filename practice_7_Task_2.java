package practice_7;

import java.util.Random;

public class practice_7_Task_2 {
    public static void main(String[] args) {
        int rows = 4, cols = 4;
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextDouble() * 100;
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    matrix[i][j] = Math.sqrt(matrix[i][j]);
                }
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}