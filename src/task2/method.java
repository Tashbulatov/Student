package task2;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        /**Бир метод тузунуз. Параметрине бир бутун сан жана бир соз
         алсын. Параметирине алган сан канчага барабар болсо,
         параметирине алган созду ошончо жолу консолго чыгарсын.
         кайтаруучу(return) метод менен чыгарабыз!!!*/
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        System.out.println(number(scanner.nextLine(), num));
    }

    public static String number(String word, int num) {
        for (int i = 1; i < num; i++) {
            System.out.println(word);

        }

        return word;
    }
}


