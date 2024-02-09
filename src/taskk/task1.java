package taskk;

import java.util.Scanner;

public class task1 {
    public static void main(String[]args) {
       int [] [] number = new int [10] [10];
       for (int i=0; i<10; i++){
           for (int j=0; j<10; j++){
               number [i][j] = (i+1)*(j+1);
               System.out.printf("%4d", number [i] [j]);
           }
           System.out.println("");
       }
    }
}
