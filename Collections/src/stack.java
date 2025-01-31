import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
