package Dynamic_Programming;

public class Fibonachi_Series {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    public static int fibo(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
