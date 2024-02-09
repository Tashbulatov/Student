package damashka22;

import java.util.Scanner;

public class domashka5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        long number = scanner.nextInt();

        System.out.println("Четные числа: " + getEvenDigits(number));
        System.out.println("Нечетные числа: " + getOddDigits(number));
    }

    public static String getEvenDigits(long number){
        String evenDigits = "";
        while(number > 0) {
            long digit = number % 10;
            if (digit % 2 == 0) {
                evenDigits = digit + " " + evenDigits;
            }
            number /= 10;
        }
        return  evenDigits;
    }
    public static String getOddDigits(long number){
        String oddDigits = "";
        while(number > 0) {
            long digit = number % 10;
            if (digit % 2 == 1) {
                oddDigits = digit + " " + oddDigits;
            }
            number /= 10;
        }
        return  oddDigits;
    }
}