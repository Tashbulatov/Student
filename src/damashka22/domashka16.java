package damashka22;

import java.util.Scanner;

public class domashka16 {
    public static void main(String[] args) {
        /**Напишите метод возвращающий тип int, вы должны в параметры
         метода дать целое положительное число n*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите n : ");
        int n = scanner.nextInt();

        System.out.println("Sum: " + getSum(n));
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
