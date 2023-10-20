package tasks;

import java.util.Scanner;

public class NumberParser {

    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParse() {
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int ones = number % 10;  // Calculate ones place
        int tens = (number / 10) % 10;  // Calculate tens place
        int hundreds = (number / 100) % 10; // Calculate hundreds place
        int sum = ones + tens + hundreds; // Calculate sum of digits

        // Updated code to display results
        System.out.println("В этом числе:");
        System.out.printf("  - единиц: %d%n", ones);
        System.out.printf("  - десятков: %d%n", tens);
        System.out.printf("  - сотен: %d%n", hundreds); // Added this line
        System.out.printf("  - сумма цифр: %d%n", sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberParser parser = new NumberParser(scanner);
        parser.doParse();
    }
}
