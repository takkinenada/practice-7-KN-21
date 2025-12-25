package practice_7;

import java.util.Scanner;

public class practice_7_Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double det = 1.0;
        for (int i = 0; i < 5; i++) {
            int pivot = i;
            for (int j = i + 1; j < 5; j++) {
                if (Math.abs(matrix[j][i]) > Math.abs(matrix[pivot][i])) {
                    pivot = j;
                }
            }

            double[] temp = matrix[i];
            matrix[i] = matrix[pivot];
            matrix[pivot] = temp;

            if (i != pivot) {
                det *= -1;
            }

            if (Math.abs(matrix[i][i]) < 1e-10) {
                det = 0;
                break;
            }

            det *= matrix[i][i];

            for (int j = i + 1; j < 5; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i + 1; k < 5; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        System.out.println("Result: " + Math.round(det));
    }
}