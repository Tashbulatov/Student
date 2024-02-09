package homework;

import java.util.Scanner;

public class damashka17 {
    /**Напишите программу, который принимает с клавиатуры два
    числа: первое - количество учеников в классе, второе - количество
    стульев в классной комнате. Программа проверит соответствие
    между этими двумя значениями и выведет на экран
    соответствующую информацию (например, для значений
35 и 39 на экран выводится 4 стула лишних).*/

    public static void main(String[] args) {
        // Аныктап алабыз окучулар менен стулдардын санын
        Scanner scanner = new Scanner(System.in);
        System.out.print("Окучулардын санын жазыныз: ");
        int numberOfStudents = scanner.nextInt();
        System.out.print("Столдордун санын жазыныз ");
        int numberOfChairs = scanner.nextInt();

        // Текшеребиз окучулар менен стулдардын чанын
        if (numberOfStudents <= numberOfChairs) {
            System.out.println("Бардык студенттердин отургучтары бар.");
        } else {
            int extraChairs = numberOfStudents - numberOfChairs;
            System.out.println("Конул бурунуз! " + extraChairs + " стулдар (а / с) керек.");
        }
    }
}
