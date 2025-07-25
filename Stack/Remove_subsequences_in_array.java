package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Remove_subsequences_in_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7, 4, 4, 4, 3};
        System.out.println(Arrays.toString(removeSubSeq(arr)));
    }

    public static int[] removeSubSeq(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || stack.peek() != nums[i]) stack.push(nums[i]);
            else if (nums[i] == stack.peek()) {
                if (i == n - 1 || nums[i] != nums[i + 1]) stack.pop();
            }
        }
        int[] ans = new int[stack.size()];
        int i = ans.length;
        for (int j = i - 1; j > -1; j--) {
            ans[j] = stack.pop();
        }
        return ans;
    }
}
