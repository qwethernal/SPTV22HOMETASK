/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhometasks;

import tasks.WeatherInYear;
import tasks.ArrayDemo;
import tasks.CreateBooksArray;
import tasks.NumberParser;
import java.util.Scanner;
import tasks.AlphabetCheck;
import tasks.EasternCalendar;
import tasks.MultiplicationTest;
import tasks.TemperatureConverter;

/**
 *
 * @author admin
 */
public class App {
    private Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу:");
            System.out.println("0. Закончить программу");
            System.out.println("1. Конвертер температуры");
            System.out.println("2. Парсер числа");
            System.out.println("3. Создание массива книг");
            System.out.println("4. Задача с массивом целых чисел");
            System.out.println("5. Температура в году");
            System.out.println("6. Восточный календарь(начиная с 1984)");
            System.out.println("7. Проверка таблицы умножения");
            System.out.println("8. Проверка наличия всех букв алфавита");

            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("--- Выбрана задача 1 (Конвертер температуры) ---");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;
                case 2:
                    System.out.println("--- Выбрана задача 2 (Парсер числа)  ---");
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                    
                case 3:
                    System.out.println("--- Выбрана задача 3 (Создание массива книг) ---");
                    CreateBooksArray createBooksArray = new CreateBooksArray();
                    createBooksArray.doCreateArray();
                    System.out.println("--- конец задачи 3 (Создание массива книг) ---");
                    break;
                    
                case 4:
                    System.out.println("--- Выбрана задача 4 (Массив четных чисел) ---");
                    ArrayDemo arrayDemo = new ArrayDemo(scanner);
                    arrayDemo.runDemo();
                    System.out.println("--- конец задачи 4 ---");
                    break;
                case 5:
                    System.out.println("--- Выбрана задача 5 (Температура в году) ---");
                    WeatherInYear weatherInYear;
                    weatherInYear = new WeatherInYear(scanner);
                    weatherInYear.runTask();
                    System.out.println("--- конец задачи 5 ---");
                    break;
                case 6:
                    System.out.println("--- Выбрана задача 6 (Восточный календарь) ---");
                    EasternCalendar easternCalendar = new EasternCalendar();
                    easternCalendar.GetYearInfo();
                    System.out.println("--- конец задачи 6 ---");
                    break;
                    
                case 7:
                    System.out.println("--- Выбрана задача 7 (Проверка таблицы умножения) ---");
                    MultiplicationTest multiplicationTest = new MultiplicationTest(scanner);
                    multiplicationTest.runTest();
                    System.out.println("--- конец задачи 7 ---");
                    break;
                case 8:
                    System.out.println("--- Выбрана задача 8 (Проверка наличия всех букв алфавита) ---");
                    AlphabetCheck alphabetCheck = new AlphabetCheck(scanner);
                    alphabetCheck.checkAlphabet();
                    System.out.println("--- конец задачи 8 ---");
                    break;

                   
                    
                default:
                    System.out.println("Выберите номер из списка!");
            }
        }while(repeat);
        System.out.println("До свидания!");
    }

    
}
