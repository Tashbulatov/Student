package homework;

import java.util.Scanner;

public class damashka24 {
    /**Напишите класс, который принимает с клавиатуры
    положительное трехзначное число и проверяет, сколько разных
    цифр оно содержит.*/


    public static void main(String[] args) {
        // Получаем положительное трехзначное число с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное трехзначное число: ");
        int number = scanner.nextInt();

        // Проверяем, является ли число трехзначным и положительным
        if (number >= 100 && number <= 999) {
            // Определяем количество различных цифр
            int digit1 = number / 100;         // Первая цифра
            int digit2 = (number / 10) % 10;   // Вторая цифра
            int digit3 = number % 10;          // Третья цифра

            // Используем множество для подсчета уникальных цифр
            System.out.println("Число " + number + " содержит " + " различных цифр.");
        } else {
            System.out.println("Ошибка. Введите положительное трехзначное число.");
        }
    }
}
