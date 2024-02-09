package homework;

import java.util.Scanner;

public class damashka10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим целое положительное число
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();

        // Проверяем, является ли число как минимум трехзначным и положительным
        if (number >= 100 && number > 0) {
            // Уменьшаем значение на 1
            int decreasedNumber = number - 1;

            // Выводим результат
            System.out.println("Новое значение: " + decreasedNumber);
        } else {
            System.out.println("Введите целое положительное число, как минимум трехзначное.");
        }

        scanner.close();
    }
}
