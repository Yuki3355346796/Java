import java.util.Random;
import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {  
        Random random = new Random();
        
      
        int targetNumber = random.nextInt(101);  // nextInt(101)生成0-100的随机数

       
        Scanner scanner = new Scanner(System.in);

       
        int guess = -1;

       
        while (guess != targetNumber) {
        
            System.out.print("cin>>: ");
            guess = scanner.nextInt();

         
            if (guess < targetNumber) {
                System.out.println("too small");
            } else if (guess > targetNumber) {
                System.out.println("too high");
            } else {
                System.out.println("great you got it!" + targetNumber + "!");
            }
        }

        // 关闭scanner
        scanner.close();
    }  
}
