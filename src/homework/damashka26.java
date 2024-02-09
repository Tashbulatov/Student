package homework;

import java.util.Scanner;

public class damashka26 {
    /**Напишите класс, который принимает с клавиатуры два
    строковых значения, каждое из которых содержит имя человека, и
    проверяет, являются ли эти люди тезками. По результатам
    проверки следует вывести на экран соответствующее сообщение.*/
    public static void main(String[] args) {
        // Получаем два строковых значения с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите второе имя: ");
        String secondName = scanner.nextLine();

        // Проверяем, являются ли люди тезками
        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Люди с именами " + firstName + " и " + secondName + " являются тезками.");
        } else {
            System.out.println("Люди с именами " + firstName + " и " + secondName + " не являются тезками.");
        }
    }
}
