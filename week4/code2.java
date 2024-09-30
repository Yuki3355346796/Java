import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter seconds: ");  
        int seconds = scanner.nextInt();  
        int minutes = seconds / 60;  
        int remainingSeconds = seconds % 60;  
        System.out.println("Minutes: " + minutes + ", Remaining Seconds: " + remainingSeconds);  
        scanner.close();  
    }  
}
