package homework;

import java.util.Scanner;

public class damashka6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим трехзначное число
        System.out.print("Введите трехзначное число: ");
        int originalNumber = scanner.nextInt();

        // Проверяем, что введенное число трехзначное
        if (originalNumber >= 100 && originalNumber <= 999) {
            // Переворачиваем число
            int reversedNumber = (originalNumber % 10) * 100 + ((originalNumber / 10) % 10) * 10 + originalNumber / 100;

            // Уменьшаем на 20
            int result = reversedNumber - 20;

            // Выводим результат
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Пожалуйста, введите трехзначное число.");
        }

        scanner.close();
    }
}
