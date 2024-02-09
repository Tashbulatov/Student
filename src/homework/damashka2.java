package homework;

import java.util.Scanner;

public class damashka2 {
    public static void main (String[]args){
        /**
         * 2. Сиздер консольдон 2 орундуу сан киргизишиниздер керек, ошол
         * санды сиздер математикалык турдоо консольго чыгарышыныздар
         * керек
         * Мисалы:
         * Input: 34
         * Output: 30 + 4
         * Input: 49
         * Output: 40 + 9
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эки сан жазыныз?");
        int san = scanner.nextInt();

        if (san>=10 && san<=99){
            int reverNumber= (san % 10) * 10 + san /10;
            System.out.println("Тескери сан:"+san);
        }else {
            System.out.println("Эки сан жазыныз?");
        }
scanner.close();
    }
}
