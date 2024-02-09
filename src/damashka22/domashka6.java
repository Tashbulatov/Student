package damashka22;

import java.util.Scanner;

public class domashka6 {
    public static void main(String[] args) {
        /**
         * 6. Напишите класс, который принимает с клавиатуры целое
         * положительное число любой длины, а затем выводит его первую
         * цифру.
         * Например, для числа 7659 на экран будет выведено 7.
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        while (number > 9) {
            number /= 10;
        }
        System.out.println(number);
    }
}