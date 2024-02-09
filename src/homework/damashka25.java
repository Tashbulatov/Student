package homework;

import java.util.Scanner;

public class damashka25 {
   /** Напишите класс, который читает с клавиатуры символ и
    проверяет, является ли введенный символ буквой латинского
    алфавита. По результатам проверки следует вывести на экран
    соответствующее сообщение.*/
   public static void main(String[] args) {
       // Получаем символ с клавиатуры
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите символ: ");
       char inputChar = scanner.next().charAt(0);

       // Проверяем, является ли символ буквой латинского алфавита
       if ((inputChar >= 'A' && inputChar <= 'Z') || (inputChar >= 'a' && inputChar <= 'z')) {
           System.out.println("Введенный символ " + inputChar + " является буквой латинского алфавита.");
       } else {
           System.out.println("Введенный символ " + inputChar + " не является буквой латинского алфавита.");
       }
   }
}
