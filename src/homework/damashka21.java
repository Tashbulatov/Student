package homework;

import java.util.Scanner;

public class damashka21 {
    /**Напишите класс, который принимает с клавиатуры
    положительное целое число и выводит на экран ближайшее к нему
«крутлое число».
    Например, для введенного значения 433 выводится на экран 430, а
    для 56 выводится 60.*/
    public static void main(String[] args) {
        // Получаем положительное целое число с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное целое число: ");
        int number = scanner.nextInt();

        // Проверяем, является ли число положительным
        if (number > 0) {
            // Вычисляем ближайшее "крутое число"
            int Number = Math.round(number / 10.0f) * 10;

            // Выводим результат
            System.out.println("Ближайшее крутое число к " + number + ": " + Number);
        } else {
            System.out.println("Ошибка. Введите положительное целое число.");
        }
    }

}
