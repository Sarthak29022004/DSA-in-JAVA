package Greedy;

public class Maximum_Score_From_Removing_Substrings_LeetCode {
    public static void main(String[] args) {
        Maximum_Score_From_Removing_Substrings_LeetCode obj = new Maximum_Score_From_Removing_Substrings_LeetCode();
        System.out.println(obj.maximumGain("cdbcbbaaabab",4,5));
    }

    public int maximumGain(String s, int x, int y) {
        StringBuilder copy = new StringBuilder(s);
        int points = 0;
        if(x>y){
            points += modify("ab", copy, x);
            points += modify("ba", copy, y);
        } else{
            points += modify("ba", copy, y);
            points += modify("ab", copy, x);
        }
        return points;
    }

    private int modify(String pattern, StringBuilder s, int points) {
        int n = s.length();
        if (n < 2) return 0;

        StringBuilder newS = new StringBuilder();
        int tot = 0;
        for (int i = 0; i < n; ++i) {
            int newLength = newS.length();
            if (newLength > 0 && newS.charAt(newLength - 1) == pattern.charAt(0) && s.charAt(i) == pattern.charAt(1)) {
                newS.deleteCharAt(newLength - 1);
                tot += points;
            } else {
                newS.append(s.charAt(i));
            }
        }
        s.setLength(0);
        s.append(newS);
        return tot;
    }
}
