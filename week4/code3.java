public class code3 {
    public static void main(String[] args) {  
        int days = 100;  
        int dayOfWeekAfter = (2 + days % 7) % 7 + 1; // 星期二为2，结果范围1-7表示星期一到星期日  
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};  
        System.out.println("Day in 100 days: " + daysOfWeek[dayOfWeekAfter - 1]); // 输出Thursday  
    }  
}
