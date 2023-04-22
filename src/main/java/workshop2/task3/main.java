package workshop2.task3;

/*
    3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
*/

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int array[] = {1, 2, -3, 4, -5, 6, 7, 8, 9, -10, 11, -12, 13, 14, 15, 16};
        System.out.print("Массив целых чисел: " + Arrays.toString(array).replaceAll("\\[|]", " ") + "\n");
        System.out.print("\nЗаменённый массив: " + Arrays.toString(ArrayReplaceDigits(array)).replaceAll("\\[|]", " "));
    }

    /**
     * @param array массив целых чисел
     * @return массив заменённых отрицательных чисел суммой индексов двузначных чисел
     */
    public static int[] ArrayReplaceDigits(int array[]) {
        System.out.print("Индексы массива целых чисел: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
            if (array[i] < 0) {
                array[i] = array[i] * -1;
                array[i] = sumOfIndexTwoDigitArray(array);
            } else {
                array[i] = array[i];
            }
        }
        return array;
    }

    /**
     * @param array массив целых чисел
     * @return сумму индексов двузначных чисел эллементов массива
     */
    public static int sumOfIndexTwoDigitArray(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 9 && i < 99) {
                sum += i;
            }
        }
        return sum;
    }
}
