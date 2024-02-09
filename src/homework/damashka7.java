package homework;

import java.util.Scanner;

public class damashka7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим трехзначное число
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        // Проверяем, что введенное число трехзначное
        if (number >= 100 && number <= 999) {
            // Находим сумму цифр
            int digit1 = number % 10;
            int digit2 = (number / 10) % 10;
            int digit3 = number / 100;

            int sum = digit1 + digit2 + digit3;

            // Выводим результат
            System.out.println("Сумма цифр: " + sum);
        } else {
            System.out.println("Пожалуйста, введите трехзначное число.");
        }

        scanner.close();
    }
}
