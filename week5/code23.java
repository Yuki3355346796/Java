import java.util.Scanner;

public class code23 {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);

       
        double radius = scanner.nextDouble();

        double area = (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * radius * radius;

       
        System.out.printf("the s is: %.2f\n", area);

       
        scanner.close();
    }  
}
