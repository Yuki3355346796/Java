import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("the 16 is: ");
        String hexNumber = scanner.nextLine();

        int decimalNumber = hexToDecimal(hexNumber);

        System.out.println("the 10 is: " + decimalNumber);

        // 关闭scanner
        scanner.close();
    }

    private static int hexToDecimal(String hex) {
        int decimalValue = 0;
        int base = 1; 

     
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);

          
            int digit = 0;
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                digit = ch - 'A' + 10;
            } else if (ch >= 'a' && ch <= 'f') {
                digit = ch - 'a' + 10;
            }

           
            decimalValue += digit * base;
            base *= 16; 
        }

        return decimalValue;
    }

}