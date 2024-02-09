package homework;

import java.util.Scanner;

/**Напишите программу, который принимает с клавиатуры два
   целых числа и, если первое больше второго, выводит на экран их
   сумму, если же наоборот - выводит на экран их произведение. В
   случае же, если числа одинаковы, программа выводит на экран
   сообщение Числа равны.**/


    public class damashka11{
        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int Number = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();


            if (Number > secondNumber) {
                int sum = Number + secondNumber;
                System.out.println("Сумма чисел: " + sum);
            } else if (Number < secondNumber) {
                int product = Number * secondNumber;
                System.out.println("Произведение чисел: " + product);
            } else {
                System.out.println("Числа равны.");
            }
        }
    }
