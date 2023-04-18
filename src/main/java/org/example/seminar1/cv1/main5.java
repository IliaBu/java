package org.example.seminar1.cv1;

public class main5 {

    /* +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком
        вопроса, например,  2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
        Предложить хотя бы одно решение или сообщить, что его нет.
*/

    public static void main(String[] args) {

        int q, w, e;
        do {
            q = getNumber(10);
            w = getNumber(10);
            e = getNumber(100);
        } while ((q < 0 && q > 9) && (w < 0 && w > 9) && (e < 10 && e > 99));

        System.out.printf("Дано выражение: %d? + ?%d = %d \n", q, w, e);

        String rezult = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((q * 10 + i) + (j * 10 + w) == e) {
                    rezult += String.format("%d%d + %d%d = %d \n", q, i, j, w, e);
                }
            }
        }
        System.out.printf((rezult == "") ? "Возможных значений ? не существует" : "Возможные значения ?: \n" + rezult);
    }

    /**
     * функция выдает случайное число с указанной разрядностью
     * @param i разрядность числа
     * @return случайное число с указанной разрядностью
     */
    public static int getNumber(int i) {
        double n = Math.random() * i;
        return (int) n;
    }

}
