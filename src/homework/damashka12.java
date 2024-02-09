package homework;

import java.util.Scanner;


/**Трехзначное положительное число называется «четнокрасивым»,
   если каждая из его цифр - четная. Напишите класс,
   который принимает с клавиатуры трехзначное число и проверяет,
   является ли оно «четнокрасивым». В соответствии с результатом
   проверки надо вывести на экран соответствующее текстовое
   сообщение. Обратите внимание: задание имеет решение с
   использованием одного оператора if и без составного условия!*/

public class damashka12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

       int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;

        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0) {
            System.out.println("Число является четнокрасивым.");
        } else {
            System.out.println("Число не является четнокрасивым.");
        }
    }
}
