package org.example.seminar1.cv1;

/*
    Вывести все простые числа от 1 до 1000
*/

public class main3 {
    public static void main(String[] args) {
        System.out.println(primeNumbers());
    }

    /***
     *
     * @return строку с простыми числами от 1 до 1000
     */
    static String primeNumbers() {
        String prime = "";
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) {
                prime += String.format("%d; ", i);
            }
        }
        return prime.substring(0, prime.length() - 2);
    }
}