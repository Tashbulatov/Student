import java.util.Random;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       int num1 = scanner.nextInt();
       if(num1 % 2==0){
           System.out.println("Жуп сан");
       } else {
           System.out.println("Так сан");
       }

    }
}


