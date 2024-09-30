import java.util.Scanner;

public class code20 {
     public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
          
        String[] zodiacSigns = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};  
          
        System.out.print("Enter a year: ");  
        int year = scanner.nextInt();  
          
        int index = (year - 4) % 12; // 4 is used because the cycle starts with monkey in 1904 (example base year)  
          
        System.out.println("Chinese Zodiac Sign: " + zodiacSigns[index]);  
    }  
}
