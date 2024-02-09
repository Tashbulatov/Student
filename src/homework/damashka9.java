package homework;

import java.util.Scanner;

public class damashka9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим целое число
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        // Проверяем значение числа и выводим соответствующее сообщение
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }

        scanner.close();
    }
}
