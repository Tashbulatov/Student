package foor;

import java.util.Scanner;

public class foor {
    public static void main(String[]args){
     Scanner scanner = new Scanner(System.in);

     int san = scanner.nextInt();
     for(int i=1; i<san; i++){
         System.out.print("*");
     }
    }
}
