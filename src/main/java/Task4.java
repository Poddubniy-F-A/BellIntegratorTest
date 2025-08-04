import java.util.Map;
import java.util.Stack;

public class Task4 {

    private static final Map<Character, Character> map = Map.of(
            '(', ')',
            '{', '}',
            '[', ']'
    );

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || !map.containsKey(stack.peek()) || map.get(stack.peek()) != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
