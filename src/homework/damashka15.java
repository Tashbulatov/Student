package homework;

import java.util.Scanner;

public class damashka15 {
    public static void main(String[] args) {

        /**Бир программа жазыныз, клавиатурадан уч сан ала турган, анан
        аларды if, else if, else жардамдары менен ушул сандарды чоною
        тартибинде чыгарасыздар консольго.*/

                // San alyp alabyz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Биринчи санды жазыныз: ");
        int num1 = scanner.nextInt();
        System.out.print("Экинчи санды жаздыныз: ");
        int num2 = scanner.nextInt();
        System.out.print("Учунчу санды жазыныз: ");
        int num3 = scanner.nextInt();

        // Sandardy azaitu uchcun
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }

    }
}
