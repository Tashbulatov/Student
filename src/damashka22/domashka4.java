package damashka22;

import java.util.Scanner;

public class domashka4 {
    public static void main(String[] args) {
        /**
         * Напишите класс, который принимает с клавиатуры две
         * переменный это два числа, пока не будет введено две одинаковых
         * чисел.
         * Класс должен выводить на экран сумму всех первых чисел и сумму
         * всех вторых чисел (не считая чисел, введенных одинаковыми).*/

        Scanner scanner = new Scanner(System.in);


        int NumbersSan = 0;
        int NumbersSan1 = 0;

        do {
            System.out.println("Сумма перовое число:"+NumbersSan);
            System.out.println("Сумма второе число:"+NumbersSan1);

            System.out.println("Введите второе число:");
            NumbersSan1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            NumbersSan = scanner.nextInt();

            NumbersSan += NumbersSan1;
            NumbersSan1+= NumbersSan;
        }while (NumbersSan1 != NumbersSan);
        System.out.println("");

    }
}
