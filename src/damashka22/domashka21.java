package damashka22;

import java.util.Random;
import java.util.Scanner;

public class domashka21 {
    /**Напишите возвращающий метод типа массива char [], который в
     качестве параметра берет число n и boolean b.
     Число n означает количество букв для заполнения, если booelan b
     будет true, то нужно вернуть char[] массив состоящий из n заглавных
     букв, если же false то прописными буквами (маленькими)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиете количество букв для заполнение");
        int n = scanner.nextInt();

        System.out.println("Введиете true and false");
        boolean b = scanner.nextBoolean();
        System.out.println(generateCharArray(n,b));

     boolean isUpperCase = true;
    char[] result = generateCharArray(n,isUpperCase);
    System.out.println(result);

    }
    private static char[] generateCharArray(int n,boolean isUpperCase) {
        char[] charArray = new char[n];

        for (int i = 0; i < n; i++) {
            if (isUpperCase){
                charArray[i]= (char) ('A' + i);
            }else {
                charArray[i] = (char) ('a' + i);

            }

        }

        return charArray;
    }

}
