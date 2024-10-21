import java.util.Calendar;
import java.util.Scanner;

public class code12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = scanner.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = scanner.nextInt();

        printCalendar(year, month);

        scanner.close();
    }

    public static void printCalendar(int year, int month) {
        int firstDay = getFirstDayOfMonth(year, month);

        System.out.println(getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < firstDay; i++) {
            System.out.print("    ");
        }

        // 打印日期
        int daysInMonth = getDaysInMonth(year, month);
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((firstDay + day - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static String getMonthName(int month) {
        String[] monthNames = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        return monthNames[month - 1];
    }

    private static int getFirstDayOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    private static int getDaysInMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}