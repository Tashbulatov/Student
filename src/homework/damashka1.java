package homework;

import java.util.Scanner;

public class damashka1 {

    /** 1. Сиздер консольдон уч орундуу
     *   сан бересиздер,ошол санды
     сиздер наобороттун чыгарып жана
     ортосунан болуп салышынздар керек
     Мисалы:
     Input: 457
     Output: 7 5 4**/

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Уч сан жазыныз?: ");
        int san = scanner.nextInt();

        if (san >= 100 && san <= 999) {
            String result = new StringBuilder(Integer.toString(san)).insert(1, new StringBuilder(Integer.toString(san)).reverse()).toString();
            System.out.println("Жыйынтык: " + result);
        } else {
            System.out.println("Куто турунуз..");
        }

        scanner.close();
    }
}

