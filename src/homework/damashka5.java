package homework;

import java.util.Scanner;
public class damashka5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим двузначное число
        System.out.print("Введите двузначное число: ");
        int originalNumber = scanner.nextInt();

        // Проверяем, что введенное число двузначное
        if (originalNumber >= 10 && originalNumber <= 99) {
            // Переворачиваем число
            int reversedNumber = (originalNumber % 10) * 10 + originalNumber / 10;

            // Увеличиваем на 8
            int result = reversedNumber + 8;

            // Выводим результат
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Пожалуйста, введите двузначное число.");
        }

        scanner.close();
    }
}
