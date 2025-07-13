package Two_Pointers;

import java.util.Arrays;

public class Maximum_Matching_of_Players_With_Trainers_LeetCode {

    public static void main(String[] args) {
        int[] players = {4, 7, 9};
        int[] trainers = {8, 2, 5, 8};
        System.out.println();
        System.out.println(matchPlayersAndTrainers(players, trainers));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int ans = 0;
        Thread t1 = new Thread(() -> Arrays.sort(players));
        Thread t2 = new Thread(() -> Arrays.sort(trainers));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        int i = 0, j = 0;
        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                ans++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return ans;
    }
}
