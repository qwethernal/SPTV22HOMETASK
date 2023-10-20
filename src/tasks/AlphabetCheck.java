package tasks;

import java.util.Scanner;

public class AlphabetCheck {

    private Scanner scanner;

    public AlphabetCheck(Scanner scanner) {
        this.scanner = scanner;
    }

    public void checkAlphabet(String text) {
        boolean[] alphabetCheck = new boolean[26];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                if (!alphabetCheck[index]) {
                    alphabetCheck[index] = true;
                    count++;
                }
            }
        }

        if (count == 26) {
            System.out.println("Текст содержит все буквы алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы алфавита.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlphabetCheck alphabetCheck = new AlphabetCheck(scanner);

        System.out.println("Введите текст для проверки:");
        String text = scanner.nextLine();

        alphabetCheck.checkAlphabet(text);
    }
}
