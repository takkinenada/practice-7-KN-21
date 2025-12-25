package practice_7;

public class practice_7_Task_1 {
    public static void main(String[] args) {
        int rows = 5;
        int[][] pyramid = new int[rows][];

        for (int i = 0; i < rows; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Normal order:");
        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nReverse order:");
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
