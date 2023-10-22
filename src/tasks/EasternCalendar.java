package tasks;

import java.util.Scanner;

public class EasternCalendar {

    String[] colors = {"Зеленый", "Красный", "Желтый", "Белый", "Черный"};
    String[] animals = {"Крысы", "Коровы", "Тигра", "Зайца", "Дракона", "Змеи", "Лошади", "Овцы", "Обезьяны", "Курицы", "Собаки", "Свиньи"};

    public void GetYearInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        int colorIndex = (year - 1984) % 60 / 12;
        int animalIndex = (year - 1984) % 12;

        String color = colors[colorIndex];
        String animal = animals[animalIndex];

        System.out.printf("Год %s %s%n", color, animal);
    }
}
