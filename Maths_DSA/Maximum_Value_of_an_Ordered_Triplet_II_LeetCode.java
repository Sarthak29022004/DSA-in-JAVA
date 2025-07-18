package Maths_DSA;

public class Maximum_Value_of_an_Ordered_Triplet_II_LeetCode {
    public static void main(String[] args) {
        int[] arr = {12,6,1,2,7};
        System.out.println(maximumTripletValue(arr));
    }

    static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        int[] leftMax = new int[n];
        leftMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        long ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = leftMax[i - 1];
            int right = rightMax[i + 1];
            ans = Math.max(ans, (long)(left - nums[i]) * right);
        }

        return ans;
    }
}
