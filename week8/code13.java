import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] sourceArray = { 2, 3, 1, 5, 10 };
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("Target array is:");
        for (int value : targetArray) {
            System.out.print(value + " ");
        }
    }

}