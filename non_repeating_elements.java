import java.util.*;
public class non_repeating_elements {
    public static void main(String[] args) {
        int[] arr = {4, -8, 1, -4, -3, -8, -3, -10, 3, -3, 10};
        System.out.println();
        System.out.println(firstNonRepeating(arr));
    }
    public static int firstNonRepeating(int[] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(map.get(num) == 1){
                return num;
            }
        }
        return 0;
    }
}