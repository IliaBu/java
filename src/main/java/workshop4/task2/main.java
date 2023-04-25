package workshop4.task2;

import java.util.Stack;

public class main {

    /*
    Дана строка строки, содержащая только символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка допустимой.
    Входная строка допустима, если:
    Открытые скобки должны быть закрыты скобками того же типа.
    Открытые скобки должны быть закрыты в правильном порядке.
    Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.

    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

    Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.
     */

    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(isValid(s1));
        String s2 = "()[]{}";
        System.out.println(isValid(s2));
        String s3 = "(]";
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
