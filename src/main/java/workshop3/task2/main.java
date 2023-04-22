package workshop3.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    /*
    2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
       Получить наименования товаров заданного сорта с наименьшей ценой.
     */

    public static void main(String[] args) {
        List<Items2> items = getItems();

        System.out.println(items);
        int ourSort = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Введите номер сорта (1, 2)");
            String sort = scanner.nextLine();
            try {
                if (Integer.parseInt(sort) > 0 && Integer.parseInt(sort) <= 3) {
                    flag = false;
                    ourSort = Integer.parseInt(sort);
                }
            } catch (Exception e) {
                System.out.println("Это не число 1, 2. Попробуйте еще раз.");
            }
        }
        scanner.close();

        double minPrice = items.get(0).price;
        for (Items2 items2 : items) {
            if (items2.sort.equals(ourSort)) {
                if (items2.price < minPrice) {
                    minPrice = items2.price;
                }
            }
        }
        StringBuilder ourNames = new StringBuilder();
        for (Items2 items2 : items) {
            if (items2.sort.equals(ourSort) && (items2.price == minPrice)) {
                ourNames.append(items2.name).append("\n");
            }
        }
        System.out.println("Самые бюджетные товары сорта " + ourSort + ": \n" + ourNames);
    }

    /**
     *
     * @return элементы массива
     */
    public static ArrayList<Items2> getItems() {
        ArrayList<Items2> items = new ArrayList<Items2>();
        items.add(new Items2("Мука Увелка пшеничная хлебопекарная высший сорт 2 кг", "Россия", 84.99,2.0,1));
        items.add(new Items2("Рис Увелка круглозерный шлифованный 800 г","Россия" , 94.99,0.8,2));
        items.add(new Items2("Крупа гречневая Увелка Ядрица отборная 800 г", "Россия", 69.99,0.8,2));
        items.add(new Items2("Крупа пшеная шлифованная высший сорт 800 г", "Россия", 39.99,0.8,1));
        items.add(new Items2("Крупа Ячневая ячменная 700 г", "Россия", 19.99,0.7,2));
        items.add(new Items2("Хлопья Националь Геркулес овсяные 450 г", "Республика Беларусь", 34.99,0.45,2));
        items.add(new Items2("Соль поваренная Илецкая РусСоль высший сорт помол №1 1 кг", "Россия", 9.99,1.0,1));
        items.add(new Items2("Масло подсолнечное Благо рафинированное дезодорированное высший сорт 1 л", "Россия", 149.99,1.0,1));
        return items;
    }

}
