package workshop6.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotebookFilter {

    /** Фильтр поиска по критериям
     *
     * @param params словарь с 2-мя значениями
     * @param notebooks список ноутбуков
     * @return список отобранного(ых) ноутбука(ов)
     */
    public static List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            boolean allFiltersMatch = true;
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String filterKey = entry.getKey();
                String filterValue = entry.getValue();
                switch (filterKey) {
                    case "manufacturer":
                        if (!notebook.getManufacturer().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "model":
                        if (!notebook.getModel().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "displaySize":
                        if (!notebook.getDisplaySize().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "displayResolution":
                        if (!notebook.getDisplayResolution().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "processor":
                        if (!notebook.getProcessor().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "ramSize":
                        if (notebook.getRamSize() != Integer.parseInt(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "hddSize":
                        if (notebook.getHddSize() != Integer.parseInt(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "os":
                        if (!notebook.getOs().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "price":
                        if (notebook.getPrice() != Double.parseDouble(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                }
                if (!allFiltersMatch) {
                    break;
                }
            }
            if (allFiltersMatch) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
}