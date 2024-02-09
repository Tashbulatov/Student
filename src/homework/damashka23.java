package homework;

import java.util.Scanner;

public class damashka23 {
   /** Напишите класс, который принимает с клавиатуры целое число,
    которое должно означать порядковый номер месяца. В случае если полученное
    значение действительно соответствует порядковому номеру
    одного из месяцев, следует вывести сезон (лето, осень, зима,
    весна), к которому относится месяц.
    В случае если введенное значение не является порядковым
    номером месяца, следует вывести на экран соответствующее
    текстовое сообщение.*/
   public static void main(String[] args) {
       // Получаем порядковый номер месяца с клавиатуры
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите порядковый номер месяца: ");
       int monthNumber = scanner.nextInt();

       // Проверяем, является ли введенное число порядковым номером месяца
       if (monthNumber >= 1 && monthNumber <= 12) {
           // Определяем сезон
           String season;
           switch (monthNumber) {
               case 12:
               case 1:
               case 2:
                   season = "зима";
                   break;
               case 3:
               case 4:
               case 5:
                   season = "весна";
                   break;
               case 6:
               case 7:
               case 8:
                   season = "лето";
                   break;
               default:
                   season = "осень";
                   break;
           }

           // Выводим результат
           System.out.println("Месяц с номером " + monthNumber + " относится к сезону " + season + ".");
       } else {
           System.out.println("Ошибка. Введите корректный порядковый номер месяца.");
       }
   }

}
