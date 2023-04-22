package workshop2.task1;

/*
  1) Дана последовательность N целых чисел. Найти сумму простых чисел.
*/

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int li[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int sum = 0;
        System.out.print("Последовательность целых чисел: " + Arrays.toString(li).replaceAll("\\D+", " ") + "\n");
        System.out.print("Простые числа: ");
        for (int i = 1; i < li.length; i++) {
            if (isPrime(li[i])) {
                System.out.print(li[i] + " ");
                sum += li[i];
            }
        }
        System.out.println("\nСумма простых чисел: " + sum);
    }

    /**
     *
     * @param i целое число
     * @return простое число
     */
    public static boolean isPrime(int i) {
        if (i != 2 && i != 3) {
            if (i % 2 == 0) return false;
            for (int j = 3; j <= (i / 2) + 1; j = j + 2) {
                if (i % j == 0) return false;
            }
        }
        return true;
    }
}