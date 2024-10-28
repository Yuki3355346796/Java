import java.util.Scanner;

public class code23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 num:");

        for (int i = 0; i < 10; i++) {
           
            numbers[i] = scanner.nextInt();
        }
     
        int[] reversedNumbers = reverseArray(numbers);

        System.out.println("The reverseArray is:");
        for (int num : reversedNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[] reverseArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}
