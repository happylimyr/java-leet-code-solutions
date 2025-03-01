package easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (final char c : s.toCharArray()) {
            if (c == '(') {
                deque.push(')');
            } else if (c == '[') {
                deque.push(']');
            } else if (c == '{') {
                deque.push('}');
            }
            else if (deque.isEmpty() || deque.pop() != c) {
                return false;
            }
        }
        return deque.isEmpty(); // {[(])}   ({}[])
    }
}
