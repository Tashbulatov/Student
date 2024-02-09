package Method;

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        System.out.println("Bir san jazynyz");
        checkNumber(new Scanner(System.in).nextInt());

    }
    public static String checkNumber(long number){
        if (number % 2 == 0){
            return "Jup san";
        }else {
            return "Tak san";
        }

    }
  }


