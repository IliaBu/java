package workshop6.task1;

import java.util.ArrayList;
import java.util.List;

public class Notebooks {

    /**
     * Список продаваемых ноутбуков
     * @return список ноутбуков
     */
    public static List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Lenovo", "17ABA7", "17 дюймов", "1920x1080", "AMD Ryzen 5 5625U", 16, 512, "без ОС", "Светло-серый", 73087));
        notebooks.add(new Notebook("Asus", "A516JA-BQ1918", "15,6 дюймов", "1920x1080", "Intel Core i7 1065G7", 16, 512, "без ОС", "Серый", 56161));
        notebooks.add(new Notebook("Huawei", "MateBook D 15 BOHRD-WDI9A", "15,6 дюймов", "1920x1080", "Intel Core i3 1115G4", 8, 256, "Windows 10", "Серибристый", 48901));
        notebooks.add(new Notebook("Apple", "MacBook Pro 13 M2 MNEH3LL/A Space Grey A2338", "13,3 дюймов", "2560x1600", "Apple M2", 8, 256, "Mac OS", "Темно-серый", 169294));
        notebooks.add(new Notebook("Asus", "TUF Gaming F15 FX506LHB-HN323", "15,6 дюймов", "1920x1080", "Intel Core i5 10300H", 8, 512, "Windows 11", "Черный", 73901));
        return notebooks;
    }

}
