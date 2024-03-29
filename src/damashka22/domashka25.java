package damashka22;

import java.util.Scanner;

public class domashka25 {
    /***
     * 25.  Дан массив состоящий из целых положительных чисел, и целое
     * число n.
     * Массив можно вручную заполнить (не сканнер), целое число n тоже
     * можно дать вручную.
     * Нужно найти с помощью суммы каких двух чисел массива мы можем
     * получить число n, если есть такие числа нужно вернуть их индексы,
     * если таких нет то вывести на экран таких нету.
     * Пример: массив -> {2, 7, 11, 15, 45}, число n -> 9
     * Нужно получить {0, 1} -> это индексы чисел с помощью суммы
     * которых можно получить число n
     * Пример: массив -> {3, 2, 4}, число n -> 6
     * Нужно получить {1, 2} -> это индексы чисел с помощью суммы
     * которых можно получить число n
     * Пример: массив -> {3, 3}, число n -> 6
     * Нужно получить {0, 1} -> это индексы чисел с помощью суммы
     * которых можно получить число n
     * Пример: массив -> {2, 7, 11, 15, 45}, число n -> 14
     * Нужно получить -1
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {2, 7, 11, 15, 45, 34, 5, 11, 8};

        System.out.println("Введите число n: ");
        int n = scanner.nextInt();

        int[] indexes = getIndex(numbers, n);

        if (indexes != null) {
            System.out.println("Индексы чисел с помошью суммы которых можно получить число n: {" + indexes[0] + ", " + indexes[1] + "}");
        } else {
            System.out.println("Таких чисел нет");
        }
    }

    public static int[] getIndex(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == n) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
