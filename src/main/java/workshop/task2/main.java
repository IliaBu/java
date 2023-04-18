package workshop.task2;
import java.util.Scanner;

/*
 2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
        Пример ввода:
       1 2 1 2 -1 1 3 1 3 -1 0
       Логика расчета:
        2 -1 переход -> 2 в сумму
       3 -1 переход -> 3 в сумму
        Пример вывода: 5
*/

public class main {
    public static void main(String[] args) {
       // int arr[] = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номера: ");
        System.out.println(summDiff(scanner));
    }

    /**
     *
     * @param scanner сумма положительных, после которых следует отрицательное число
     * @return
     */
    public static int summDiff(Scanner scanner) {
        int a = scanner.nextInt();
        int sum = 0;
        while (a != 0) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                sum += a;
            }
            a = b;
        }
        scanner.close();
        return sum;
    }
}
