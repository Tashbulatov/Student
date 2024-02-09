package homework;

import java.util.Scanner;

public class damashka20 {
/**    Напишите программу , которая принимает с клавиатуры
    трехзначное положительное число и проверяет, содержится ли в
    нем хотя бы один ноль. По результатам проверки надо вывести
    количество нулей в числе.*/

public static void main(String[] args) {
    // Клавиатурадан уч орундуу он санды алуу
    Scanner scanner = new Scanner(System.in);
    System.out.print("Уч орундуу он санды киргизиниз: ");
    int number = scanner.nextInt();

    // Сандын уч орундуу жана он экендигин текшериниз
    if (number >= 100 && number <= 999) {
        // Сандагы нолдордун санын эсептоо
        int num1 = number / 100;       //Биринчи сан
        int num2 = (number / 10) % 10; //Экинчи сан
        int num3 = number % 10;        //Учунчу сан

        int countZeros = (num1 == 0 ? 1 : 0) + (num2 == 0 ? 1 : 0) + (num3 == 0 ? 1 : 0);

        // Жыйынтык чыгаруу
        if (countZeros > 0) {
            System.out.println("Ичинде " + number + " камтылган" + countZeros + " 0");
        } else {
            System.out.println("Ичинде" + number + " 0 жок.");
        }
    } else {
        System.out.println("Ката. Уч орундуу он санды киргизиниз.");
    }
}

}
