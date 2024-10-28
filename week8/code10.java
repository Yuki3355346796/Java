import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "septeme", "october", "Noveamber", "Decener" };
        System.out.print("Enter a month number(1 to 12):");
        Scanner input = new Scanner(System.in);
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
        input.close();
    }
}
