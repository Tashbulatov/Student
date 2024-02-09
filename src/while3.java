import java.util.Random;
import java.util.Scanner;

public class while3 {
    public static void main(String[]args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int nam = random.nextInt(20,35);

        System.out.println("Random san: " + nam);
        int my = 0;


        while (my != nam){
            System.out.println("Sizdin tandonuz?");
            my = scanner.nextInt();
            if (my > nam){
                System.out.println("Sizdin tandoonuz jogoru");
            } else if (my<nam) {
                System.out.println("Sizdin tandoonuz kichinekei");
            }else {
                System.out.println("Barabar");
            }
        }




    }
}
