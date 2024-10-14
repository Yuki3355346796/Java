import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        int sum = 0, j = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            if (i < j) {
                System.out.println();
            } else {
                System.out.println(j);
            }
            while (j < 10)
            {
                j++;
            }
            do{
                j++;
            }while(j<10);
        }
    }
}
