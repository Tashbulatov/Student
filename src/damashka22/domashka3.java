package damashka22;

import java.util.Scanner;

public class domashka3 {
    public static void main(String[] args) {

        /**Напишите класс, который принимает с консоли для переменной X
         целое положительное число, а затем дополнительно будет
         спрашивать ещё числа, эти числа будут должны вычитаться из
         переменной x, вы будете вводить числа до тех пор пока X не будет
         отрицательным или равен 0*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite seloe polojitellnyi chislo:");
        int x = scanner.nextInt();

        while (x>0){
            System.out.println("obshaia suma:"+x);
            System.out.println("vedite chislo:");
            x -= scanner.nextInt();
        }
        if (x<=0){
            System.out.println("x<=0");
        }

    }
}
