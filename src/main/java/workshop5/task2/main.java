package workshop5.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class main {

    /*
    2) Пусть дан список сотрудников:
    Иван Иванов
    Светлана Петрова
    Кристина Белова
    Анна Мусина
    Анна Крутова
    Иван Юрин
    Петр Лыков
    Павел Чернов
    Петр Чернышов
    Мария Федорова
    Марина Светлова
    Мария Савина
    Мария Рыкова
    Марина Лугова
    Анна Владимирова
    Иван Мечников
    Петр Петин
    Иван Ежов
    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
    Отсортировать по убыванию популярности.
     */

    /**
     *
     * @param list список сотрудников
     * @return имена сотрудников
     */
    public static ArrayList<String> getName(String[] list) {
        ArrayList<String> listName = new ArrayList<>();
        for (String el : list) {
            String[] elList = el.split(" ");
            listName.add(elList[0]);
        }
        return listName;
    }

    /**
     *
     * @param name список имён сотрудников
     * @return список имён и количество повторяющихся имён
     */
    public static Map<String, Integer> getMap(ArrayList<String> name) {
        Map<String, Integer> mapName = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j))) {
                    count += 1;
                }
            }
            if (!mapName.containsKey(name.get(i))) {
                mapName.put(name.get(i), count);
            }
        }
        return mapName;
    }

    public static void nameRepeat(Map<String, Integer> map) {
        for (var item : map.entrySet()) {
            if (item.getValue() > 1) {
                System.out.printf("%s: %d \n", item.getKey(), item.getValue());
            }
        }
    }

    public static void sortName(Map<String, Integer> map) {
        ArrayList<Integer> listCount = new ArrayList<>();
        for (var item : map.entrySet()) {
            if (!listCount.contains(item.getValue())) {
                listCount.add(item.getValue());
            }
        }
        listCount.sort(null);
        for (int i = listCount.size() - 1; i > -1; i--) {
            for (var item : map.entrySet()) {
                if (Objects.equals(listCount.get(i), item.getValue())) {
                    System.out.printf("%s : %d \n", item.getKey(), item.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] employees = new String[]{
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };
        ArrayList<String> employeesName = getName(employees);
        Map<String, Integer> mapName = getMap(employeesName);
        System.out.println("Повторяющиеся имена: ");
        nameRepeat(mapName);
        System.out.println("");
        System.out.println("Имена, отсортированные по убыванию популярности: ");
        sortName(mapName);
    }

}
