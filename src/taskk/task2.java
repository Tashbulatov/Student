package taskk;

import java.util.Scanner;

public class task2 {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String sun = (a < 18) ? "Сенин жашын жете элек" : " Жумушка кабыл алындыныз ";
        System.out.println(sun);

    }

}
