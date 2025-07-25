package ArraysJava;

public class Maximum_Product_of_Two_Elements_in_an_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>max1){
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2){
                max2 = nums[i];
            }
        }
        int ans = (max1 - 1) * (max2 - 1);
        return ans;
    }
}
