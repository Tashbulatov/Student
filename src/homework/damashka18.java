package homework;

import java.util.Scanner;

public class damashka18 {
    /**Бир программа жазыныз, сиз торт орундуу оң сан бериниз, сиз
    текшеришиниз керек кайсыл орундагы саны чон экен, консольго
    чыгарышынз мисалы: биринчи сан 25 экинчи сан 35 тен чон, же экоо
    барабар болсо 25 жана 25 бири бирине барабар деп чыгарасыз.*/
    public static void main(String[] args) {
        // Биринчи санды киргизуу
        Scanner scanner = new Scanner(System.in);
        System.out.print("Биринчи санды киргизиңиз: ");
        int Number = scanner.nextInt();

        // Экинчи санды киргизуу
        System.out.print("Экинчи санды киргизиңиз: ");
        int Num = scanner.nextInt();

        // Кайсысы чон экендигин текшерүү
        if (Number > Num) {
            System.out.println(Number + " чон. Экинчи сан " + Num + " кайдан?");
        } else if (Num > Number) {
            System.out.println(Num + " чон. Биринчи сан " + Number + " кандай?");
        } else {
            System.out.println("Биринчи сан " + Number + " жана экинчи сан " + Num + " бир-бирине барабар.");
        }
    }
}
