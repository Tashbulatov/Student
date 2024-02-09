package taskk;

import java.lang.ref.SoftReference;
import java.util.Random;
import java.util.Scanner;

public class task {
    public static void main(String[]args){
       Random random = new Random();

       int num1 = random.nextInt(1,30);
       System.out.println("num1"+num1);
       int num2 = random.nextInt(1,30);
       System.out.println("num1:"+ num2);

       int max = Math.max(num1,num2);
       int min = Math.min(num1,num2);
       int abc = Math.abs(num1-num2);

       System.out.println("Мах: " +max);
       System.out.println("Мах: " +min);
       System.out.println("Мах: " +abc);

    }
}
