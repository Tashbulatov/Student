package homework;

import java.util.Random;

public class damashka27 {

    /**  Напишите класс, который генерирует и выводит на экран
     случайное целое чисел из диапазона положительных двузначных
     чисел.*/
    public static void main(String[] args) {


        int randomNumber = generateRandomTwoDigitNumber();


        System.out.println("Случайное положительное двузначное число: " + randomNumber);
    }


    private static int generateRandomTwoDigitNumber() {
        Random random = new Random();

        return random.nextInt(90) + 10;
    }
}
