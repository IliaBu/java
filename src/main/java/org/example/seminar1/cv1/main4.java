package org.example.seminar1.cv1;

import java.util.Scanner;

/*
    Реализовать простой калькулятор
 */

public class main4 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два номера через пробел: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nВведите операцию ( +, -, *, / ): ");
        operator = reader.next().charAt(0);
        ans = actions(operator, num1, num2);
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + ans);
    }

    /***
     * функция, которая непосредственно производит вычислительные действия с двумя числами,
     * указанным оператором
     * @param operator оператор вычисления
     * @param num1 первое число
     * @param num2 второе число
     * @return число результат
     */
    public static Double actions(char operator, Double num1, Double num2) {
        Double ans = 0.0;
        switch (operator) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Введён не корректный оператор");
        }
        return ans;
    }

}
