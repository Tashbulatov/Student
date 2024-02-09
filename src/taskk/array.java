package taskk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //Массив тандап алабыз   (100го чейин)
        int[] array = generateRandomArray(100);

        //Массивди консолго чыгарабыз
        System.out.println("Массив: " + Arrays.toString(array));

        //Консолдон сан алабыз
        Scanner scanner = new Scanner(System.in);
        System.out.print("Издо учун сан жазыныз: ");
        int number = scanner.nextInt();

        //Массивтен сан издейбиз
        int index = findNumberInArray(array, number);

        //Жыйынтык
        if (number != -1) {
            System.out.println("САН " + number + "Массив табылды " + index);
        } else {
            System.out.println("САН " + number + " Мындай сан массивтин ичинде жок.");
        }
    }
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    private static int findNumberInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
