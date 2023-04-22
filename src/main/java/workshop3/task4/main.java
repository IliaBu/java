package workshop3.task4;

import java.util.ArrayList;
import java.util.Random;

public class main {

    /*
    4. Задан целочисленный список ArrayList.
       Найти минимальное, максимальное и среднее из этого списка.
    */

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Целочисленный список: \n");
        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(1, 20));
        }
        System.out.print(list.toString().replaceAll("\\D+", " "));
        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
            sum += list.get(i);
        }
        float average = sum / list.size();
        System.out.printf("\nМаксимальный элемент: %d\n", max);
        System.out.printf("Минимальный элемент: %d\n", min);
        System.out.printf("Среднее арифметическое списка чисел: %.1f\n", average);

    }
}
