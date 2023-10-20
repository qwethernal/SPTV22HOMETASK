
package tasks;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTest {

    private final Random random = new Random();
    private final Scanner scanner;

    public MultiplicationTest(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runTest() {
        int correctAnswers = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(9) + 1; // Генерация случайного числа от 1 до 9
            int num2 = random.nextInt(9) + 1;

            int correctResult = num1 * num2;

            System.out.printf("Вопрос %d: %d умножить на %d? Введите ответ: ", i + 1, num1, num2);
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctResult) {
                System.out.println("\u001B[32mПравильно!\u001B[0m");
                correctAnswers++;
            } else {
                System.out.println("\u001B[31mОшибка\u001B[0m");
            }
        }

        System.out.println("Тест завершен.");

        if (correctAnswers == 5) {
            System.out.println("Отлично!");
        } else if (correctAnswers >= 3) {
            System.out.println("Средне");
        } else {
            System.out.println("Слабо");
        }
    }
}
