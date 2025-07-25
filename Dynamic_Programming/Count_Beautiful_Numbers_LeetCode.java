package Dynamic_Programming;

public class Count_Beautiful_Numbers_LeetCode {
    public static void main(String[] args) {
        System.out.println(beautifulNumbers(10,20));
    }
    public static int beautifulNumbers(int l, int r) {
        int ans = 0;
        for (int i = l; i <= r; i++) {

            if (i<11 || i %10==0) ans++;
//            int pr = 1;
//            int sum = 0;
//            int num = i;
//            while (num > 0) {
//                pr = pr * (num % 10);
//                sum += num % 10;
//                num /= 10;
//            }
//            if(pr%sum==0) ans++;
        }
        return ans;
    }
}
