package tasks;

import java.util.Random;
import java.util.Scanner;

public class WeatherInYear {

    private final Scanner scanner;
    private enum MONTHS {
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
    }

    public WeatherInYear(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runTask() {
        Random random = new Random();

        System.out.println("Массив погоды в году по месяцам: ");
        int[][] weatherInYear = new int[12][];
        weatherInYear[0] = new int[31];
        weatherInYear[1] = new int[28];
        weatherInYear[2] = new int[31];
        weatherInYear[3] = new int[30];
        weatherInYear[4] = new int[31];
        weatherInYear[5] = new int[30];
        weatherInYear[6] = new int[31];
        weatherInYear[7] = new int[31];
        weatherInYear[8] = new int[30];
        weatherInYear[9] = new int[31];
        weatherInYear[10] = new int[30];
        weatherInYear[11] = new int[31];

        for (int i = 0; i < weatherInYear.length; i++) {
            for (int j = 0; j < weatherInYear[i].length; j++) {
                switch (i) {
                    case 11: // Декабрь
                    case 0:  // Январь
                    case 1:  // Февраль
                        weatherInYear[i][j] = random.nextInt(26) + (-30);
                        break;
                    case 2:  // Март
                    case 3:  // Апрель
                    case 4:  // Май
                        weatherInYear[i][j] = random.nextInt(21) - 5;
                        break;
                    case 5:  // Июнь
                    case 6:  // Июль
                    case 7:  // Август
                        weatherInYear[i][j] = random.nextInt(21) + 10;
                        break;
                    case 8:  // Сентябрь
                    case 9:  // Октябрь
                    case 10: // Ноябрь
                        weatherInYear[i][j] = random.nextInt(26) - 10;
                        break;
                }
            }
        }

        System.out.printf("%14s", " ");
        for (int si = 0; si < 31; si++) {
            System.out.printf("%-4d", si + 1);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < weatherInYear.length; i++) {
            System.out.printf("%10s: ", MONTHS.values()[i]);
            for (int j = 0; j < weatherInYear[i].length; j++) {
                System.out.printf("%4d", weatherInYear[i][j]);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Введите день (1-31): ");
            int day = scanner.nextInt();

            if (day >= 1 && day <= 31) {
                System.out.printf("Температура воздуха %d %s: %d%n", day, MONTHS.values()[month - 1], weatherInYear[month - 1][day - 1]);
            } else {
                System.out.println("Неверный ввод дня!");
            }

            int[] temperatures = weatherInYear[month - 1];
            int maxTemp = Integer.MIN_VALUE;
            int minTemp = Integer.MAX_VALUE;
            int maxDay = -1;
            int minDay = -1;

            for (int i = 0; i < temperatures.length; i++) {
                if (temperatures[i] > maxTemp) {
                    maxTemp = temperatures[i];
                    maxDay = i + 1;
                }
                if (temperatures[i] < minTemp) {
                    minTemp = temperatures[i];
                    minDay = i + 1;
                }
            }

            System.out.printf("Самая теплая погода была %d градусов в %d %s%n", maxTemp, maxDay, MONTHS.values()[month - 1]);
            System.out.printf("Самая холодная погода была %d градусов в %d %s%n", minTemp, minDay, MONTHS.values()[month - 1]);

            int sum = 0;
            for (int temperature : temperatures) {
                sum += temperature;
            }
            int average = sum / temperatures.length;
            System.out.printf("Средняя температура в этом месяце: %d градусов%n", average);
        } else {
            System.out.println("Неверный ввод месяца!");
        }
    }
}
