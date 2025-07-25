package Stack;
import java.util.Stack;
public class Minimum_String_Length_After_Removing_Substrings_LeetCode {
    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }
    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if (ch != 'B' && ch != 'D'){
                stack.push(ch);
            } else if (ch == 'B') {
                if (!stack.isEmpty()){
                    if (stack.peek()=='A'){
                        stack.pop();
                    } else{
                        stack.push(ch);
                    }
                } else {
                    stack.push(ch);
                }
            } else {
                if (!stack.isEmpty()){
                    if (stack.peek()=='C'){
                        stack.pop();
                    } else{
                        stack.push(ch);
                    }
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}
