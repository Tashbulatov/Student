package damashka22;

import java.util.Scanner;

public class domashka7 {
    public static void main(String[] args) {
        /***
         * 7. Напишите класс, который принимает с клавиатуры целое число
         * любой длины и строит из него число с обратным порядком цифр.
         * Новое значение следует вывести в консоль.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        long number = scanner.nextLong();

        long reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        System.out.println("Перевернутое число: " + reversedNumber);
    }
}
