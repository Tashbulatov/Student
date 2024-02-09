package homework;

import java.util.Scanner;

public class damashka13 {
    public static void main(String[]args){
        /**. Бир программа жазыныздар, ал программа консольдон 2
        орундуу сан алыш керек, бир гана if менен текшериш керек сандын
        1 оруну жана 2 орунунун кобойтуусу чонбу же сан озубу*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cан жазыныз?");

        int number = scanner.nextInt();
        //tekesherebiz
        if (number > 10){
            System.out.printf(number+">10");
        }else {
            System.out.println("Сан:" + number);
        }
    }

}
