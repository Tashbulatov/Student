package damashka22;

import java.util.Random;

public class damashka2 {
    public static void main(String[] args) {
        /**Напишите класс, который генерирует 20 рандомных целых чисел
         из диапазона -50 до +50, и определяет наименьшее число и
         наибольшее число.*/
        Random random = new Random();
        int sanMin = 0;
        int sanmMax = 0;

        String numbers = "";

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(-50,+50);

           //numbers += i ! = 19 ? num + ", " : num;

            if (num > sanmMax){
                sanmMax = num;
            }

         if (num < sanMin){
             sanMin = num;
}

        }
        //System.out.println("Все рандомные числа: ["+numbers+"]");
        System.out.println("Наиманьшее число: " + sanMin);
        System.out.println("Наиманьшее число: " + sanmMax);
    }
}



