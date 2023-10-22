package tasks;

import java.util.Scanner;

public class NumberParser {

    Scanner scanner;
    
    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParse() {
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;
        int sum = ones + tens + hundreds;


        System.out.println("В этом числе:");
        System.out.printf("  - единиц: %d%n", ones);
        System.out.printf("  - десятков: %d%n", tens);
        System.out.printf("  - сотен: %d%n", hundreds);
        System.out.printf("  - сумма цифр: %d%n", sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberParser parser = new NumberParser(scanner);
        parser.doParse();
    }
}
