import java.util.Scanner;

public class code15 {
    public static void main(String[] args) {
        // 创建Scanner对象以获取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入第一个城市
        System.out.print("city1: ");
        String city1 = scanner.nextLine();

        // 提示用户输入第二个城市
        System.out.print("city2: ");
        String city2 = scanner.nextLine();

        // 比较两个城市的字母顺序
        if (city1.compareTo(city2) < 0) {
            // 如果city1在字母表中排在city2之前
            System.out.println("in alphabetical order are: " + city1 + ", " + city2);
        } else {
            // 否则，city2在字母表中排在city1之前
            System.out.println("in alphabetical order are: " + city2 + ", " + city1);
        }

        // 关闭scanner
        scanner.close();
    }
}