package workshop.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {

    /*
1) 151. Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.
     */

    public static void main(String[] args) {
        String s = " the sky     is      blue ";
        System.out.println("Входная строка: "+ s);
        System.out.println("Результат: " + reverseWords(s));
    }

    public static String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
