import java.util.Scanner;

public class code22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");

       
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        
        double minValue = findSmallestElement(numbers);
 
        System.out.println("The mininum number is: " + minValue);

        scanner.close();
    }

   
    public static double findSmallestElement(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
