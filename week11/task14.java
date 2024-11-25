import java.util.Random;

public class task14 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };

        System.out.println("Original matrix:");
        printMatrix(m);

        shuffle(m);

        System.out.println("\nShuffled matrix:");
        printMatrix(m);
    }

    public static void shuffle(int[][] m) {
        Random random = new Random();
        int rows = m.length;

        for (int i = 0; i < rows; i++) {

            int j = random.nextInt(rows);

            swapRows(m, i, j);
        }
    }

    private static void swapRows(int[][] m, int i, int j) {
        int[] temp = m[i];
        m[i] = m[j];
        m[j] = temp;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}