package org.example.seminar1.cv1;

//ctrl+alt+l - форматирование кода
//ctrl+alt+o - чистит форматирование и код
//shift + F6 - переименование
//Alt + Insert - вызов окна выбора метода

//int a,b;
//sum(a,b);  // alt+enter - подсказка

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //System.out.println();  //todo: доделать что-то

        //Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
        //Input: n = 234
        //Output: 15
        //Explanation:
        //Product of digits = 2 * 3 * 4 = 24
        //Sum of digits = 2 + 3 + 4 = 9
        //Result = 24 - 9 = 15
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println(subtractProductAndSum(a));
        scanner.close();


//Массивы:
//Дан массив целых чисел. Верно ли, что массив является симметричным.

    }
    /**
     *
     * @param a задаваемое число
     * @return возвращает произведение минус сумма
     */
    public static int subtractProductAndSum(int a) {

        int product = 1;
        int sum = 0;
        while (a != 0) {
            product *= a % 10;
            sum += a % 10;
            a /= 10;
        }
        return product - sum;
    }


    //public String addBinary(String a, String b) {

    //}

    // private static String sum(int a, int b){
    //      return null;
    // }
    //после метода возможен быстрый вывод через .soutv
}