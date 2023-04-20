package org.example.seminar1.cv4;

public class main {

    public static void main(String[] args) {
        System.out.println(addBinary("101", "100"));
        System.out.println(addBinary2("101", "100"));
        System.out.println(addBinary3("101", "100"));
    }

    public static String addBinary2(String a, String b) {
        int val1 = Integer.parseInt(a, 2);
        int val2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(val1 + val2);

    }

    public static String addBinary(String a, String b) {
        int mem = 0;
        String result = "";

        while (a.length() > b.length()) {
            b = "0" + b;
        }

        while (b.length() > a.length()) {
            a = "0" + a;
        }

        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                result += (0 + mem);
                mem = 0;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (mem == 1) result += 1;
                else {
                    result += 0;
                    mem = 1;
                }
            } else {
                if (mem == 1) {
                    result += 0;
                    mem = 1;
                } else result += 1;
            }
        }

        if (mem == 1) result += 1;

        StringBuilder builder = new StringBuilder(result);
        return builder.reverse().toString();
    }

    public static String addBinary3(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary3(b, a);
        }
        int carry = 0;
        int j = b.length() - 1;
        String ans = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carry++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carry++;
            }
            ans = carry % 2 + ans;
            j--;
            carry /= 2;
        }
        if (carry > 0) {
            ans = carry % 2 + ans;
        }
        return ans;

    }
}
