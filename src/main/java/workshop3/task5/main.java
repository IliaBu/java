package workshop3.task5;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class main {

    /*
    5*) при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
        Пример входных данных:
        [1,2,3]
        Пример выходных данных:
        [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        new main().permuteItems(arr);
    }

    public static void swapItems(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    /**
     *
     * @param arr исходный массив
     */
    public void permuteItems(int[] arr) {
        System.out.println("Массив cо всеми возможными перестановками элементов: ");
        permute(arr, 0, arr.length - 1);
    }

    /**
     *
     * @param arr исходный массив
     * @param i   начальный index
     * @param n   конечный index
     */
    public static void permute(int[] arr, int i, int n) {
        int j;
        if (i == n)
            printArray(arr);
        else {
            for (j = i; j <= n; j++) {
                swapItems(arr, i, j);
                permute(arr, i + 1, n);
                swapItems(arr, i, j);
            }
        }
    }

    /**
     *
     * @param array исходный массив
     */
    public static void printArray(int[] array) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int aNum : array) {
            stringJoiner.add("" + aNum);
        }
        System.out.println(stringJoiner.toString());
    }
}