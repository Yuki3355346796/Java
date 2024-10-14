import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        System.out.print("the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("the second integer:");
        int num2 = scanner.nextInt();

   
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("something wrong");
        } else {
            // 计算并显示最大公约数
            int gcd = findGCD(num1, num2);
            System.out.println("the greatest common divisor is" + gcd);
        }

        // 关闭scanner
        scanner.close();
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}