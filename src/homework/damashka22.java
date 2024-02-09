package homework;

import java.util.Scanner;

public class damashka22 {
    /**Назовем билет с шестизначным номером «счастливым», если
    сумма первых трех его цифр равна сумме последних трех его цифр
    и обе эти суммы являются четными.
    Напишите класс, который принимает с клавиатуры шестизначный
    номер билета и проверяет, является ли он «счастливым» или не
    является.*/

    public static void main(String[] args) {
        // Получаем шестизначный номер билета с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначный номер билета: ");
        int ticketNumber = scanner.nextInt();

        // Проверяем, является ли номер билета шестизначным
        if (ticketNumber >= 100000 && ticketNumber <= 999999) {
            // Вычисляем суммы первых и последних трех цифр
            int digit1 = ticketNumber / 100000;         // Первая цифра
            int digit2 = (ticketNumber / 10000) % 10;   // Вторая цифра
            int digit3 = (ticketNumber / 1000) % 10;    // Третья цифра
            int digit4 = (ticketNumber / 100) % 10;     // Четвертая цифра
            int digit5 = (ticketNumber / 10) % 10;      // Пятая цифра
            int digit6 = ticketNumber % 10;             // Шестая цифра

            int sumFirstHalf = digit1 + digit2 + digit3;
            int sumSecondHalf = digit4 + digit5 + digit6;

            // Проверяем условия "счастливого" билета
            if (sumFirstHalf % 2 == 0 && sumSecondHalf % 2 == 0 && sumFirstHalf == sumSecondHalf) {
                System.out.println("Билет с номером " + ticketNumber + " - счастливый!");
            } else {
                System.out.println("Билет с номером " + ticketNumber + " не является счастливым.");
            }
        } else {
            System.out.println("Ошибка. Введите шестизначный номер билета.");
        }
    }
}
