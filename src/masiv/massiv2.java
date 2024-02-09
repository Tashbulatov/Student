package masiv;

import java.util.Random;

public class massiv2 {
    public static void main(String[] args){
        int[]numbers = new int[10];


        int basket=0;

        Random random = new Random();
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = random.nextInt(1, 10);
            System.out.println(numbers[i] + " ");
            basket += numbers[i];

        }
            System.out.println("Jalpy san:"+ basket);
            System.out.println("Arf maani:"+basket/ numbers.length);
        }
    }
