package tasks;

import java.util.Scanner;

public class AlphabetCheck {

    private Scanner scanner;

    public AlphabetCheck(Scanner scanner) {
        this.scanner = scanner;
    }

    public void checkAlphabet() {
        System.out.println("Введите текст для проверки:");
        String text = scanner.nextLine();
        boolean[] alphabetCheck = new boolean[33];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (Character.UnicodeBlock.of(ch) == Character.UnicodeBlock.CYRILLIC) {
                int index = ch - 'а';
                if (!alphabetCheck[index]) {
                    alphabetCheck[index] = true;
                    count++;
                }
            }
        }

        if (count == 33) {
            System.out.println("Текст содержит все русские буквы алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все русские буквы алфавита.");
        }
    }
}
