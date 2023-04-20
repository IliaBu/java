package org.example.seminar1.cv2;

import java.util.Scanner;

public class main {
    //psvm
    public static void main(String[] args) {
        //Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите числа: ");
       // int n = scanner.nextInt();
       // System.out.println(countDiff(n, scanner));

        int arr[] = { 1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0 };
        System.out.println(getMaxSum(arr));

    }
//1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0
    /**
     * @param n       количество чисел в последовательности
     * @param scanner количество положительных чисел идущих перед отрицательными
     * @return
     */
    public static int countDiff(int n, Scanner scanner) {
        int count = 0;
        int a = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                count++;
            }
            a = b;
        }
        return count;
    }

    public static int getMaxSum(int[] a) {
        int maxsum = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (maxsum > sum) {
                maxsum = sum;
            }  else if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }

}