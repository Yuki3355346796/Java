

import java.util.Random;

public class TheRandomClass {
    public static void main(String[] args) {
        Random generator1=new Random(3);
        System.out.print("From generator1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(generator1.nextInt(1000)+" ");

        }

        Random generator2=new Random(3);
        System.out.println("\nFrom generator2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(generator2.nextInt(1000)+" ");
        }
    }
}