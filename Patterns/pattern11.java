package Patterns;

//                        * * * * *
//                         * * * *
//                          * * *
//                           * *
//                            *

public class pattern11 {
    public static void main(String[] args) {
        pat(5);
    }

    static void pat(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row-1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
