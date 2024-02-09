package homework;

import java.util.Random;
import java.util.Scanner;

public class damashka29 {
    public static void main(String[] args) {

        /**
         * Напишите программу, сиз консольдон эки маани алышыныз
          керек рандом учун, биринчи сан нижний диапазон, экинчи сан
         верхний диапазон, рандом сан бир санды генерация кылат.
         Сиз консольдон бир сан киргизишиниз керек, эгерде сиз жазган сан
         менен рандом сан барабар болсо, окуучу тапты деген нерсени
         чыгарышыныз керек, болбосо окуучу таппады деген жазуу.
         */
        // 1ден 100гө чейинки диапазондо туш келди санды түзүү
        int randomNumber = generateRandomNumber(1, 100);

        // Колдонуучудан клавиатура номерин алуу
        Scanner scanner = new Scanner(System.in);
        System.out.print("1ден 100го чейин сан танданыз: ");
        int userNumber = scanner.nextInt();

        // Киргизилген Сан рандом менен бирдей экендигин текшериңиз
        if (userNumber == randomNumber) {
            System.out.println("Куттуктайбыз! Сиз санды таптыныз.");
        } else {
            System.out.println("Кечирес сиз санды чыгара албадыс: " + randomNumber);
        }
    }

    // Берилген диапазондо туш келди санды түзүү ыкмасы
    private static int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        //  туш келди санды түзүү
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
