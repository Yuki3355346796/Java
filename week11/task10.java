import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS * 2];

        Scanner input = new Scanner(System.in);
        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day - 1][hour - 1] = temperature;
            data[day - 1][hour - 1 + NUMBER_OF_HOURS] = humidity;
        }
        input.close();

        double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperatureTotal += data[i][j];
                dailyHumidityTotal += data[i][j + NUMBER_OF_HOURS];
            }
            System.out.println("Day " + (i + 1) + "'s average temperature is " +
                    dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + (i + 1) + "'s average humidity is " +
                    dailyHumidityTotal / NUMBER_OF_HOURS);
            dailyTemperatureTotal = 0;
            dailyHumidityTotal = 0;
        }
    }
}