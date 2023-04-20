package org.example.seminar1.cv5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Массивы:
        // Дан массив целых чисел. Верно ли, что массив является симметричным.
        // https://leetcode.com/problems/running-sum-of-1d-array/
        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]
        // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

        Scanner input = new Scanner(System.in);
        int N;
        int i;
        N = input.nextInt();
        int[] numbers = new int[N];

        for (i = 0; i < N; i++) {
            numbers[i] = input.nextInt();
        }
        i = 0;
        while (i < N / 2 && numbers[i] == numbers[N - 1 - i]) {
            i++;
        }

        if (i == N / 2) {
            System.out.println("The array is a symetrical array");
        } else {
            System.out.println("The array is NOT a symetrical array");
        }

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 77};
        System.out.println(sumElements(arr));

    }

    /**
     * @param arr массив целых чисел
     * @return сумма элементов массива
     */

    public static int sumElements(int[] arr) {
        int sum = 0;
        for (int item : arr
        ) {
            sum += item;
        }
        return sum;
    }

}
