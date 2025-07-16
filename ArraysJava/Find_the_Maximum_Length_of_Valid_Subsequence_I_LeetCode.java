package ArraysJava;

public class Find_the_Maximum_Length_of_Valid_Subsequence_I_LeetCode {
    public static void main(String[] args) {
        int[] nums = {1, 5, 9, 4, 2};
        System.out.println(maximumLength(nums));
    }

    public static int maximumLength(int[] nums) {
        int[] count = new int[2];
        int[] end = new int[2];

        for (int num : nums) {
            int parity = num % 2;
            count[parity]++;
            end[parity] = end[1 - parity] + 1;
        }

        return Math.max(
                Math.max(count[0], count[1]),
                Math.max(end[0], end[1])
        );
    }
}
