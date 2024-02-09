package Method;

import java.util.Random;
import java.util.Scanner;

public class method4 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1,10);
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println( randomScaner(num, num1));
    }
    public static boolean randomScaner(int san1,int san2){
        if (san1==san2){
            return true;
        }else {
            return false;
        }
    }
}
