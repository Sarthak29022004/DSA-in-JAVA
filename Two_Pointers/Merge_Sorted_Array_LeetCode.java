package Two_Pointers;

import java.util.Arrays;

public class Merge_Sorted_Array_LeetCode {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int[] nums2 = {1,2,2};
        System.out.println(Arrays.toString(merge(nums1,6,nums2,3)));
    }
    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (m + n == 1) {
            if (nums2.length == 1) {
                nums1[0] = nums2[0];
                return nums1;
            }
        } else if(nums2.length==0){

        } else {
            int len = (m + n) - m;
            int j = 0;
            for(int i = len; i < m + n; i++){
                nums1[i] = nums2[j];
            }
        }
        return nums1;
    }
}
