package workshop5.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

    /*
    1) Подсчитать количество искомого слова, через map
    (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
    Пример:
    Россия идет вперед всей планеты. Планета — это не Россия.
    Запрос: Россия
    Ответ: Россия - 2
    toLoverCase().
    (Усложнение - игнорировать пунктуацию)*
     */

    public static void main(String[] args) {

        String sourceText = getSourceTextWithIgnoredPunctuation("Россия идет вперед всей планеты. Планета - это не Россия.");
        System.out.println(sourceText);

        Map<String, Integer> ourWords = new HashMap<>();
        String[] arr = sourceText.split(" ");

        for (String s : arr) {
            if (ourWords.get(s.toLowerCase()) != null) {
                ourWords.put(s.toLowerCase(), ourWords.get(s.toLowerCase()) + 1);
            } else {
                ourWords.putIfAbsent(s.toLowerCase(), 1);
            }
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Введите слово для подсчёта нахождений");
        String keyWord = s.nextLine().toLowerCase();

        System.out.printf("Слово [%s] в тексте встречается [%d] раз(а)%n", keyWord, ourWords.get(keyWord));
        s.close();
    }

    /**
     *
     * @param sourceText исходный текст
     * @return текст с игнорируемой пунктуацией
     */
    private static String getSourceTextWithIgnoredPunctuation(String sourceText) {
        sourceText = sourceText.replace(".", "")
                .replace(",", "")
                .replace(":", "")
                .replace(";", "")
                .replace("\"", "")
                .replace("/", "")
                .replace("|", "")
                .replace("(", "")
                .replace(")", "")
                .replace("[", "")
                .replace("]", "")
                .replace("{", "")
                .replace("}", "")
                .replace("-", "")
                .replace("'", "")
                .replace("*", "");
        return sourceText;
    }


}
