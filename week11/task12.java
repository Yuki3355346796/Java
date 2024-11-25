public class task12 {

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {

        double[][] matrix = {
                {1.5, 2.3, 4.0, 1.0},
                {5.5, 6.7, 8.0, 2.0},
                {9.5, 1.3, 1.0, 3.0}
        };

        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.1f ", val);
            }
            System.out.println();
        }


        for (int i = 0; i < matrix[0].length; i++) {
            double columnSum = sumColumn(matrix, i);
            System.out.println("Sum of the elements at column " + i + " is " + columnSum);
        }
    }
}
