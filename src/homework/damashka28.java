package homework;

import java.util.Random;

public class damashka28 {

    /** Напишите класс, который генерирует случайное положительное
     двузначное число, а затем генерирует три целых положительных
     числа, меньших первого.*/
    public static void main(String[] args) {
        // Туш келди он эки орундуу санды тузуу
        int firstNumber = generateRandomTwoDigitNumber();

        //Биринчи кичине 3 бутун он санды тузу
        int secondNumber = generateRandomNumberLessThan(firstNumber);
        int thirdNumber = generateRandomNumberLessThan(firstNumber);
        int fourthNumber = generateRandomNumberLessThan(firstNumber);

        // Жыйынтык чыгарабыз
        System.out.println("Случайное положительное двузначное число: " + firstNumber);
        System.out.println("Три целых положительных числа, меньших первого: " + secondNumber + ", " + thirdNumber + ", " + fourthNumber);
    }

    private static int generateRandomTwoDigitNumber() {
        Random random = new Random();
        return random.nextInt(90) + 10;
    }

    private static int generateRandomNumberLessThan(int max) {
        Random random = new Random();

        return random.nextInt(max - 1) + 1;
    }
}
