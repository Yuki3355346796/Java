import java.util.Scanner;

public class code5 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                // Read an initial data
                System.out.print(
                                "Enter an integer (the input ends if it is O):");
                int data = input.nextInt();
                int sum = 0;
                while (data != 0) {
                        sum += data;
                        // Read the next data
                        System.out.print(
                                        "Enter an integer (the input ends if it is 0):");
                        data = input.nextInt();
                }
                System.out.println("The sum is " + sum);
        }
}
