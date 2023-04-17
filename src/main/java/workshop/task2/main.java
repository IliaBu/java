package workshop.task2;

import java.util.Scanner;

/*
    Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.println(calculateProductSum(n));
        scanner.close();
    }

    /**
     *
     * @param n число, заданное пользователем
     * @return строку с n-ым треугольным числом и n!
     */
    static String calculateProductSum(int n) {
        int product = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            product *= i;
            sum += i;
        }
        return String.format("%d-ое треугольного числа = %d, %d! = %d \n", n, sum, n, product);
    }
}
