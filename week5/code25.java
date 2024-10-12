import java.util.Arrays;
import java.util.Scanner;

public class code25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("city1: ");
        String city1 = scanner.nextLine();

        System.out.print("city2: ");
        String city2 = scanner.nextLine();

        System.out.print("city3: ");
        String city3 = scanner.nextLine();

        String[] cities = { city1, city2, city3 };

        Arrays.sort(cities);

        System.out.println("the order is: ");
        for (String city : cities) {
            System.out.println(city);
        }

        scanner.close();
    }
}
