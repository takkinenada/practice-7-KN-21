package practice_7;

import java.util.Scanner;

public class practice_7_Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int[][] transposed = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                transposed[j][i] = matrix[i][j];
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }
    }
}