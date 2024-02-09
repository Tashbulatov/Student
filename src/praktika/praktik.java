package praktika;

import java.util.Scanner;

public class praktik {

public static void main(String[]args){
   Scanner scanner = new Scanner(System.in);

   System.out.println("Атыныз?");
   String name = scanner.nextLine();
   System.out.println("Фамиляныз?");
   String surname = scanner.nextLine();
   System.out.println("Жашыныз?");
   int age = scanner.nextInt();
   System.out.println("Телефон номериниз?");
   int fon = scanner.nextInt();
   System.out.println("Стажыныз?");
    int yer = scanner.nextInt();

   System.out.println("Кабыл алынды!!!\t");
   System.out.println("Атыныз:\t"+name);
   System.out.println("Фамиля:\t"+surname);
   System.out.println("Сатаж:\t"+yer);
   System.out.println("Телефон:\t"+fon);
              }
         }
