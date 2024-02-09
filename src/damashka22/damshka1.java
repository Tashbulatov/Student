package damashka22;

import java.util.Random;

public class damshka1 {
    public static void main(String[] args) {
        /**1. Напишите класс, который создает 20 случайных чисел диапазона
        1 - 99. Следует вывести в консоль только те числа которые делятся
        на 1-ое рандомное число без остатка.*/

        Random random = new Random();
        int numbers = random.nextInt(1,99);
        System.out.println("The first random digit: " +  numbers);


        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(1,99);
            System.out.println(num);
            if (num%numbers==0) {
                System.out.println("Division digit without a remainder "+num);
            }
        }
      }
    }

