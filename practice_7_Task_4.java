package practice_7;

import java.util.Scanner;

public class practice_7_Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int rowToRemove = sc.nextInt();
        int colToRemove = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) continue;
            for (int j = 0; j < m; j++) {
                if (j == colToRemove) continue;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}