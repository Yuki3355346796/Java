import java.util.Random;

public class task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[4][4];

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int maxRow = 0;
        int maxCol = 0;
        int maxCount = 0;

        // Find the row with the most 1s
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }

        // Find the column with the most 1s
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxCol = j;
            }
        }

        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }
}