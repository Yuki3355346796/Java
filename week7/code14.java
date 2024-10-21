import java.util.Scanner;

public class code14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("the second integer: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("the greatest common divisor is " + gcd);

        scanner.close();
    }

    private static int findGCD(int a, int b) {

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}