package tasks;

import java.util.Random;
import java.util.Scanner;

public class WeatherInYear {

    private final Scanner scanner;
    private enum MONTHS {
        Январь,Февраль,Март,Апрель,Май,Июнь,Июль,Август,Сентябрь,Октябрь,Ноябрь,Декабрь
    }

    private int[][] weatherInYear;

    public WeatherInYear(Scanner scanner) {
        this.scanner = scanner;
        this.weatherInYear = new int[12][];
        this.weatherInYear[0] = new int[31];
        this.weatherInYear[1] = new int[28];
        this.weatherInYear[2] = new int[31];
        this.weatherInYear[3] = new int[30];
        this.weatherInYear[4] = new int[31];
        this.weatherInYear[5] = new int[30];
        this.weatherInYear[6] = new int[31];
        this.weatherInYear[7] = new int[31];
        this.weatherInYear[8] = new int[30];
        this.weatherInYear[9] = new int[31];
        this.weatherInYear[10] = new int[30];
        this.weatherInYear[11] = new int[31];
    }

    public void generateRandomWeather() {
        Random random = new Random();
        int min = -30;
        int max = 40;
        for (int i = 0; i < weatherInYear.length; i++) {
            for (int j = 0; j < weatherInYear[i].length; j++) {
                weatherInYear[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    public void printWeatherForDate(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > getDaysInMonth(month)) {
            System.out.println("Некорректная дата.");
            return;
        }
        int temperature = weatherInYear[month - 1][day - 1];
        System.out.printf("Погода %d %s: %d градусов%n", day, MONTHS.values()[month - 1], temperature);
    }

    public void findWarmestAndColdestDays() {
        int warmestTemp = Integer.MIN_VALUE;
        int coldestTemp = Integer.MAX_VALUE;
        int warmestDay = 0;
        int coldestDay = 0;

        for (int i = 0; i < weatherInYear.length; i++) {
            for (int j = 0; j < weatherInYear[i].length; j++) {
                if (weatherInYear[i][j] > warmestTemp) {
                    warmestTemp = weatherInYear[i][j];
                    warmestDay = j + 1;
                }
                if (weatherInYear[i][j] < coldestTemp) {
                    coldestTemp = weatherInYear[i][j];
                    coldestDay = j + 1;
                }
            }
        }

        System.out.printf("Самый теплый день: %d градусов%n", warmestTemp);
        System.out.printf("Самый холодный день: %d градусов%n", coldestTemp);
    }

    public void calculateAverageTemperatureByMonth() {
        for (int i = 0; i < weatherInYear.length; i++) {
            int sum = 0;
            for (int j = 0; j < weatherInYear[i].length; j++) {
                sum += weatherInYear[i][j];
            }
            double average = (double) sum / weatherInYear[i].length;
            System.out.printf("Средняя температура в %s: %.2f градусов%n", MONTHS.values()[i], average);
        }
    }

    private int getDaysInMonth(int month) {
        int days;
        switch (month) {
            case 2:
                days = 29; // В високосные года у февраля 29 дней
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }

    public void runTask() {
        generateRandomWeather();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Введите день (1-31): ");
        int day = scanner.nextInt();
        printWeatherForDate(month, day);

        findWarmestAndColdestDays();

        calculateAverageTemperatureByMonth();
    }
}
