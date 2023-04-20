package seminar2.cv3;

public class main {

    /*
    3) Дан массив целых чисел.
    Найти количество пар соседних элементов, где первый
элемент вдвое больше второго.
     */

    public static void main(String[] args) {
        System.out.println(getAmount());
    }


    public static int getAmount() {
        int[] array = new int[]{4, 2, 20, 10, 5, 3, 8, 4, 8, 4, 8, 4, 8, 4};
        int amount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] * 2) {
                amount++;
            }
        }
        return amount;

    }
}
