package org.example.seminar1.cv3;

public class main {

public static void main(String[] args) {
    System.out.println(replacePartOfString("Fghhfhgdgdg"));
}

    public static String replacePartOfString(String str) {
        int length = str.length();
        String sub1 = str.substring(0, length / 2);
        String sub2 = str.substring(length / 2, length);

        return sub2 + sub1;
    }
}
