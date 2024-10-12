import java.util.Scanner;

public class code22 {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0 && number <= 15) {
            char hexChar;
            if (number < 10) {
              
                hexChar = (char) ('0' + number);
            } else {
        
                hexChar = (char) ('A' + (number - 10));
            }
            
            System.out.println("The hex value is: " + hexChar);
        } else {
            // 输入无效
            System.out.println(number+"is an invalid input");
        }

        // 关闭scanner
        scanner.close();
    }  
}
