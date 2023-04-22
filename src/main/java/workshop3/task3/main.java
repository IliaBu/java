package workshop3.task3;

import workshop3.task2.Items2;

import java.util.ArrayList;
import java.util.List;

public class main {

    /*
    3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
       Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
     */
    public static void main(String[] args) {
        List<Books> book = getBooks();
        StringBuilder sortedBooks = new StringBuilder();
        System.out.print("Название книги в которой содержится простое количество страниц и фамилия автора содержит букву 'а': \n");
        for (Books books : book) {
            if (isPrime(books.numberOfPages) && books.author.toLowerCase().contains("а")) {
                if (books.year >= 2010 && books.year <= 2023) {
                    sortedBooks.append(books.name).append("\n");
                }
            }
        }
        System.out.println(sortedBooks + " ");
    }

    /**
     * @return элементы массива
     */
    public static ArrayList<Books> getBooks() {
        ArrayList<Books> book = new ArrayList<Books>();
        book.add(new Books("Война и мир. Том 1-4", "Толстой", 1410.00, 2022, 1472));
        book.add(new Books("Моби Дик, или Белый Кит", "Мелвилл", 2499.00, 2023, 682));
        book.add(new Books("Руслан и Людмила", "Пушкин", 729.00, 2023, 136));
        book.add(new Books("Малахитовая шкатулка", "Бажов", 230.00, 2023, 541));
        book.add(new Books("Алые паруса", "Грин", 479.00, 2009, 102));
        book.add(new Books("Ромео и Джульетта", "Шекспир", 429.00, 2008, 176));
        book.add(new Books("Таинственный остров", "Верн", 364.00, 2020, 640));
        book.add(new Books("Белый пароход", "Айтматов", 219.00, 2010, 257));
        book.add(new Books("Вишнёвый сад", "Чехов", 282.00, 2023, 224));
        return book;
    }

    /**
     * @param i целое число
     * @return простое число
     */
    private static boolean isPrime(int i) {
        if (i != 2 && i != 3) {
            if (i % 2 == 0) return false;
            for (int j = 3; j <= (i / 2) + 1; j = j + 2) {
                if (i % j == 0) return false;
            }
        }
        return true;
    }
}
