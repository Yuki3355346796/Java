import java.util.Scanner;

public class code12 {
        public static void main(String[] args) {
            int count = 0; 
            int number = 2; 
    System.out.println("the first 50 prime number are:");
            while (count < 50) { 
                if (isPrime(number)) { 
                    System.out.print(number + " "); 
                    count++; 
    
                    
                    if (count % 10 == 0) {
                        System.out.println(); 
                    }
                }
                number++; 
            }
        }
    
    
        private static boolean isPrime(int n) {
            if (n <= 1) {
                return false; 
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false; 
                }
            }
            return true; 
        }
}
