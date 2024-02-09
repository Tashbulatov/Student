package taskk;

import java.util.Random;
import java.util.Scanner;

public class dmzad {
    public static void main(String[]agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапозона: ");
        int sum = scanner.nextInt();
        System.out.println("Введите конец дипозона: ");
        int sum2 = scanner.nextInt();


        Random random = new Random();
        int run1 = random.nextInt( sum + sum2);
        int run2 = random.nextInt(sum + sum2);
        int run3 = random.nextInt(sum + sum2);

        System.out.println("Сгенерировные числа:"  +run1+ " " +run2+ " " +run3);

        int minNumber = Math.min(run1,Math.min(  run2 , run3));

        System.out.println("наименьше число:"+ minNumber);

    }
}

