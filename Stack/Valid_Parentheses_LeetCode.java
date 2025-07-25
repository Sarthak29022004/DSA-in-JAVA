package Stack;

import java.util.Stack;

public class Valid_Parentheses_LeetCode {
    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));    //'(', ')', '{', '}', '[' and ']'
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == '{') {
                stack.push(ch);
            } else if (ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '(') return false;
                if (stack.peek() == '(') stack.pop();
            } else if (ch == '}') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '{') return false;
                if (stack.peek() == '{') stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '[') return false;
                if (stack.peek() == '[') stack.pop();
            }
        }
        return stack.isEmpty();
    }
}


//        for(char ch:s.toCharArray())
//        {
//            if(ch=='(') stack.push(')');
//            else if(ch=='{') stack.push('}');
//            else if(ch=='[') stack.push(']');
//            else if (stack.isEmpty() || stack.pop()!=ch)
//            return false;
//
//        }
//        return stack.isEmpty();