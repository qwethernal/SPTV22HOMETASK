package tasks;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
    private Scanner scanner;

    public ArrayDemo(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runDemo() {
        int[] myArray = new int[20];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(11) * 2;
            sum += myArray[i];
        }

        int max = myArray[0];
        int min = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }

        sum = sum - max - min;
        int average = sum / (myArray.length - 2);

        System.out.println("Массив из 20 случайных четных чисел: ");
        for (int i : myArray) {
            System.out.printf("%4d", i);
        }

        System.out.printf("%nСреднее арифметическое элементов массива " +
                "без учета максимального и минимального числа: ");
        System.out.println(average);
    }
}
