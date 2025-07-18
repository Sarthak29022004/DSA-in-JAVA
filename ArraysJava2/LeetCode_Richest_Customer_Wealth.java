//A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth.

//Example 1:
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.

//Example 2:
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
//Explanation:
//1st customer has wealth = 6
//2nd customer has wealth = 10
//3rd customer has wealth = 8
//The 2nd customer is the richest with a wealth of 10.

//Example 3:
//Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
//Output: 17

package ArraysJava2;

public class LeetCode_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 2}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] row : accounts) {
            int rowSum = 0;               //rowSum contains the total value of sub-array
            for (int col : row) {
                rowSum = rowSum + col;
            }
            if (rowSum > max) {
                max = rowSum;
            }
        }
        return max;
    }
}
