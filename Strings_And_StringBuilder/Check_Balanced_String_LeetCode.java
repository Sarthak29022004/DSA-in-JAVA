package Strings_And_StringBuilder;

public class Check_Balanced_String_LeetCode {
    public static void main(String[] args) {
        System.out.println(isBalanced("24123"));
    }

    static boolean isBalanced(String num) {
        int e = 0;
        int o = 0;
        for (int i = 0, j = 1; i < num.length() && j < num.length(); i += 2, j += 2) {
            int no = num.charAt(i) - '0';
            int ne = num.charAt(j) - '0';
            o += no;
            e += ne;
        }
        if (num.length() % 2 == 1) {
            o += num.charAt(num.length() - 1) - '0';
        }
        return e == o;
    }
}

//        int sumOdd = 0;
//        int sumEven = 0;
//        for( int i = 0; i < num.length(); i++ )
//            if( i % 2 == 0 ) sumEven += num.charAt(i) - '0';
//            else sumOdd += num.charAt(i) - '0';
//        return sumOdd == sumEven;
