package damashka22;

import java.util.Scanner;

public class domashka19 {
    public static void main(String[] args) {
        /**Напишите возвращающий метод типа String, который в качества
        параметра прнинимает число, и возвращает день недели как слово
        String.
        (Можно использовать switch or if else)*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write day of week: ");
        int day = scanner.nextInt();

        System.out.println(getDayOfWeek(day));

    }

    public static String getDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "There is no such day of the week!";
        };
        return dayOfWeek;
    }
}