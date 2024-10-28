import java.util.Scanner;

public class code21 {
    public static void main(String[] args) {
        int[] list = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
        int j = binarySearch(list, 7);
        int k = binarySearch(list, 70);
        System.out.println("Key index:" + j);
        System.out.println("Key index:" + k);

    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else
                low = mid + 1;
        }
        return -low - 1;
    }
}