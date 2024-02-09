package taskk;

import java.util.Scanner;

public class dlya {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Бир сан жазыныз:");
        int a = scanner.nextInt();
        int san = a / 10;
        int san1 = a % 10;
        int nu = san + san1;
        System.out.println(nu);
        int number = nu / 10;
        int number1 = nu % 10;
        int numbers = number + number1;
        System.out.println(numbers);

        }
    }
