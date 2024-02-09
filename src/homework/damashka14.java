package homework;

import java.util.Scanner;

public class damashka14 {

    /**Бир программа жазыныз, сиз клавиатурадан эки сан беришиниз
    керек, биринчи сан окуучулардын саны, экинчи отургучтардын саны.
    Сиздер текшеришиниздер керек окуучуларга орун жетеби же
    жетпейби*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получаем количество студентов и количество мест с клавиатуры
        System.out.print("Окучулардын санын жазыныз: ");
        int numberokuu = scanner.nextInt();
        System.out.print("Орундуктардын санын жазыныз: ");
        int numberor = scanner.nextInt();

        // Проверяем, достаточно ли мест
        if (numberokuu <= numberor) {
            System.out.println("Орундар баарына жетиштуу.");
        } else {
            System.out.println("Отургучтар жетет экен: Отургучтар жетпей калат:");
        }
    }
}
