
import java.util.Arrays;

public class Thread_in_java {

    public static void main(String[] args) {
        int[] nums = {3, 2, 9, 6, 3, 7};
        int[] nums2 = {3, 2, 9, 6, 3, 7};
        long time = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println((System.currentTimeMillis() - time) + "ml");
    }
}
