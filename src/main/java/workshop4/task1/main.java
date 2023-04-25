package workshop4.task1;

import java.util.Scanner;
import java.util.Stack;

public class main {

    /*  1) Вывести список на экран в перевернутом виде (без массивов и ArrayList)
        Пример:
        1 -> 2 -> 3 -> 4
        Вывод:
        4 -> 3 -> 2 -> 1
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Введите количество элементов:");
        int size = s.nextInt();
        System.out.println("Введите " + size + " элемента(ов):");
        int i = 0;
        int number;
        while (i < size) {
            number = s.nextInt();
            stack.push(number);
            i++;
        }
        System.out.println(stack.toString().replaceAll("\\[|]", " "));
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop() + " ");
        }
    }
}