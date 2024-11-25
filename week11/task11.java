import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 2, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };


        int[] totalHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours[i] += workHours[i][j];
            }
        }


        Integer[] indices = new Integer[workHours.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(totalHours[b], totalHours[a]));

        // Print sorted employees and their total hours
        System.out.println("Employees sorted by total hours in descending order:");
        for (int index : indices) {
            System.out.println("Employee " + index + " total hours: " + totalHours[index]);
        }
    }
}
