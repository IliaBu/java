package workshop2.task2;

/*
   2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
*/

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 20, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println("Последовательность целых чисел: " + Arrays.toString(array).replaceAll("\\D+", " "));
        String res = isIncreasing(array) ? "является" : "не является";
        System.out.println("Последовательность " + res + " возрастающей");
    }

    /**
     *
     * @param arr массив целых чисел
     * @return true, если массив целых чисел отсортированы в порядке возрастания, в противном случае возвращает false.
     */
    public static boolean isIncreasing(int arr[]) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i-1]) return false;
        return true;
    }
}