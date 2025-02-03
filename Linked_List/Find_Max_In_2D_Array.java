package Linked_List;

public class Find_Max_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {26, 34, 11, 87},
                {15, 40},
                {27, 84, 9, 75}
        };
        System.out.println(min(arr));
    }

    static int min(int[][] ar) {
        int max = Integer.MIN_VALUE;
        for (int[] i : ar) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }
}
