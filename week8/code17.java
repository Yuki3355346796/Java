import java.util.Scanner;

public class code17 {
    public static void main(String[] args) {

        int[] a = { 1, 2 };

        System.out.println("Before invoking Swap");
        System.out.println("array is {" + a[0] + "," + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking Swap");
        System.out.println("array is {" + a[0] + "," + a[1] + "}");

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + "," + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + "," + a[1] + "}");
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

}