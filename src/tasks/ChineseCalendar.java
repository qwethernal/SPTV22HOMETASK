package tasks;

public class ChineseCalendar {

    private String[] colors = {"Зеленый", "Красный", "Желтый", "Белый", "Черный"};
    private String[] animals = {"Крысы", "Коровы", "Тигра", "Зайца", "Дракона", "Змеи", "Лошади", "Овцы", "Обезьяны", "Курицы", "Собаки", "Свиньи"};

    public void getYearInfo(int year) {
        int colorIndex = (year - 1984) % 60 / 12;
        int animalIndex = (year - 1984) % 12;

        String color = colors[colorIndex];
        String animal = animals[animalIndex];

        System.out.printf("Год %s %s%n", color, animal);
    }
}
