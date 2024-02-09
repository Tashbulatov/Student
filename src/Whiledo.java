import java.util.Scanner;

public class Whiledo {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int sun;
        do {
            System.out.println("Сан жазыныз?");
             a = scanner.nextInt();
             b = scanner.nextInt();
            System.out.println(a+b);
            System.out.println("Улантасызбы?");
            sun = scanner.nextInt();
        }while (sun==1 || sun == 2);



    }
}
