package homework;

import java.util.Scanner;

public class damashka8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим целое число
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        // Проверяем, является ли число положительным
        if (number > 0) {
            // Удваиваем значение
            int doubledNumber = number * 2;

            // Выводим результат
            System.out.println("Новое значение: " + doubledNumber);
        } else {
            System.out.println("Введенное число не является положительным.");
        }

        scanner.close();
    }
}
