import java.util.Scanner;

public class While1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("san jazynyz");
        int san = scanner.nextInt();
     while (san>=1){
         System.out.println(san);
         san--;
     }
    }
}
