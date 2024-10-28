import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        float[] mylist = new float[5];

        for (int i = 1; i < mylist.length; i++) {
            mylist[i] = (float) Math.random() * 10;
        }
        // Display an array
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + "");
        }
        float max = mylist[0];
        int indexOfMax = 0;
        for (int i = 1; i < mylist.length; i++) {
            if (mylist[i] > max) {
                max = mylist[i];
                indexOfMax = i;
            }
        }
        System.out.println();
        System.out.println("Largest element in the array is:" + max);
        System.out.println("The index of the largest element:" + indexOfMax);
    }

}
