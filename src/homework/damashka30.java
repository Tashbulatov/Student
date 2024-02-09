package homework;

import java.util.Random;
import java.util.Scanner;

public class damashka30 {
    public static void main(String[] args) {

        /**
         * Напишите программу, которая генерирует числа от 1 до 3, 1 -
         * камень, 2 - ножницы, 3 бумага. Сиз озунуз бир сан бересиз
         * консольдон анан текшересиз if, else if, else шарттык операторлор
         * менен, ким утту же тең чыгуу болду деп.*/
        //tandap alabyz
        int computerChoice = generateRandomNumber(1, 3);

        // katyshudan tandoosu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Танданыз: (1 - ТАШ, 2 - КАЙЧЫ, 3 - КАГАЗ): ");
        int userChoice = scanner.nextInt();

        // teksherip alabyz komp meenen katyshuchunu
        if (userChoice == computerChoice) {
            System.out.println("Тен эмес! Эко окшош , сиз жана компьютер.");
        } else if ((userChoice == 1 && computerChoice == 2) ||
                (userChoice == 2 && computerChoice == 3) ||
                (userChoice == 3 && computerChoice == 1)) {
            System.out.println("Сиз уттунуз! Куттуктайбыз!");
        } else {
            System.out.println("Сиз Утулдунуз. Компьютер башканы тандады.");
        }

        // kompyun tandosu
        System.out.println("Компьютер тандады: " + convertToChoiceString(computerChoice));
    }

    // metod artky pragramanyn ishtesuu
    private static int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Метод для преобразования числа в строку с выбором
    private static String convertToChoiceString(int choice) {
        switch (choice) {
            case 1:
                return "ТАШ";
            case 2:
                return "КАЙЧЫ";
            case 3:
                return "КАГАЗ";
            default:
                return "ТУРА ЭМЕС ТАНДОО";
        }
    }
}
