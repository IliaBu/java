package workshop6.task1;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• Создать множество ноутбуков.
• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
• Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.*;

public class main {

    public static void main(String[] args) {

        Map filters = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Производитель");
        System.out.println("2 - Модель");
        System.out.println("3 - Размер дисплея");
        System.out.println("4 - Разрешение дисплея");
        System.out.println("5 - Процессор");
        System.out.println("6 - Объем оперативной памяти");
        System.out.println("7 - Объем жесткого диска");
        System.out.println("8 - Операционная система");
        System.out.println("9 - Цвет");
        System.out.println("10 - Цена");

        Scanner scanner = new Scanner(System.in);
        int filterNumber = scanner.nextInt();

        String filterKey = "";
        switch (filterNumber) {
            case 1:
                filterKey = "manufacturer";
                System.out.println("Введите производителя: ");
                String manufacturer = scanner.next();
                filters.put(filterKey, manufacturer);
                break;
            case 2:
                filterKey = "model";
                System.out.println("Введите модель: ");
                String model = scanner.next();
                filters.put(filterKey, model);
                break;
            case 3:
                filterKey = "displaySize";
                System.out.println("Введите размер дисплея: ");
                String displaySize = scanner.next();
                filters.put(filterKey, displaySize);
                break;
            case 4:
                filterKey = "displayResolution";
                System.out.println("Введите разрешение дисплея: ");
                String displayResolution = scanner.next();
                filters.put(filterKey, displayResolution);
                break;
            case 5:
                filterKey = "processor";
                System.out.println("Введите модель процессора: ");
                String processor = scanner.next();
                filters.put(filterKey, processor);
                break;
            case 6:
                filterKey = "ramSize";
                System.out.println("Введите объем оперативной памяти: ");
                int ramSize = scanner.nextInt();
                filters.put(filterKey, ramSize);
                break;
            case 7:
                filterKey = "hddSize";
                System.out.println("Введите объем жесткого диска: ");
                int hddSize = scanner.nextInt();
                filters.put(filterKey, hddSize);
                break;
            case 8:
                filterKey = "os";
                System.out.println("Введите операционную систему (либо без ОС, если не установлена): ");
                String os = scanner.next();
                filters.put(filterKey, os);
                break;
            case 9:
                filterKey = "color";
                System.out.println("Введите цвет: ");
                String color = scanner.next();
                filters.put(filterKey, color);
                break;
            case 10:
                filterKey = "price";
                System.out.println("Введите цену: ");
                double price = scanner.nextDouble();
                filters.put(filterKey, price);
                break;
        }

        List<Notebook> notebooks = Notebooks.initListNotebooks();
        List<Notebook> filteredNotebooks = NotebookFilter.filter(filters, notebooks);
        if (filteredNotebooks.size() == 0) {
            System.out.println("Нет ноутбуков, удовлетворяющих критерию фильтрации");
        } else {
            for (Notebook notebook : filteredNotebooks) {
                System.out.println(notebook.getManufacturer() + " " + notebook.getModel() + " " + notebook.getDisplaySize() + " " + notebook.getDisplayResolution() + " " +
                        notebook.getProcessor() + " " + notebook.getRamSize() + " " + notebook.getHddSize() + " " + notebook.getOs() + " " + notebook.getColor() + " " +
                        notebook.getPrice());
            }
        }
    }
}
