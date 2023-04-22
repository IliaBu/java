package workshop3.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class main {

    /*
    1. Дан массив записей: наименование товара, цена, сорт.
       Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
    */

    public static void main(String[] args) {
        List<Items> items = getItems();

        String searchName = "высший";
        Double maxPrice = 0.0;
        String maxPriceSortedNames = "";

        for (Items item : items) {
            if (item.name.toLowerCase().contains(searchName) && (item.sort == 1 || item.sort == 2)) {
                if (maxPrice < item.price) {
                    maxPrice = item.price;
                }
            }
        }

        for (Items item : items) {
            if (item.name.toLowerCase().contains(searchName) && (item.sort == 1 || item.sort == 2)) {
                if (Objects.equals(item.price, maxPrice)) {
                    maxPriceSortedNames += item.name + "\n";
                }
            }
        }

        System.out.println("Самые дорогие товары первого и второго сорта, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceSortedNames);
        System.out.println("Наибольшая цена: " + maxPrice);
    }

    /**
     *
     * @return элементы массива
     */
    public static ArrayList<Items> getItems() {
        ArrayList<Items> items = new ArrayList<Items>();
        items.add(new Items("Мука Увелка пшеничная хлебопекарная высший сорт 2 кг", 84.99, 1));
        items.add(new Items("Рис Увелка круглозерный шлифованный 800 г", 94.99, 2));
        items.add(new Items("Крупа гречневая Увелка Ядрица отборная 800 г", 69.99, 2));
        items.add(new Items("Крупа пшеная шлифованная высший сорт 800 г", 39.99, 1));
        items.add(new Items("Крупа Ячневая ячменная 700 г", 19.99, 2));
        items.add(new Items("Хлопья Националь Геркулес овсяные 450 г", 34.99, 2));
        items.add(new Items("Соль поваренная Илецкая РусСоль высший сорт помол №1 1 кг", 9.99, 1));
        items.add(new Items("Масло подсолнечное Благо рафинированное дезодорированное высший сорт 1 л", 149.99, 1));
        return items;
    }
}
