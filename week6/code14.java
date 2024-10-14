public class code14 {
    public static void main(String[] args) {

        double tuition = 10000.0;

        double targetTuition = 20000.0;

        double annualIncreaseRate = 0.07; // 7%

        int years = 0;

        while (tuition < targetTuition) {

            tuition += tuition * annualIncreaseRate;

            years++;
        }
        int ans=(int) (Math.ceil(tuition*100));
        double ans2=ans/100.0;

        // 输出结果
        System.out.println("tuition will be double in " + years + " years");
        System.out.println("tuition will be " +ans2+ " in " + years + " years");
    }
}
