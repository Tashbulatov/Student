package Varargs;

import java.util.ArrayList;
import java.util.Scanner;

public class varargs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(onnunumber(5,6,7));
    }
    public static int onnunumber (int... num1){
        int basket=0;
        for (int i = 0; i < num1.length; i++) {
         basket+=num1[i];
        }
        return basket;
    }
}
