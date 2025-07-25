package ArraysJava;

import java.util.Arrays;

public class Height_Checker_LeetCoode {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }
    public static int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        int j = 0;
        for(int i: heights){
            arr[j] = heights[j];
            j++;
        }
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != arr[i]){
                ans++;
            }
        }
        return ans;
    }
}
