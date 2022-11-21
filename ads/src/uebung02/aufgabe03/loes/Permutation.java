package uebung02.aufgabe03.loes;

import java.util.Arrays;

public class Permutation {

    static int count = 0;

    private static void swap(char[] a, int idx1, int idx2) {
        char tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    public static void permute(String str) {
        permute(str.toCharArray(), 0);
    }

    private static void permute(char[] str, int startIndex) {

        if (str.length - startIndex <= 2) {
            // Basisfall
            String x = String.copyValueOf(Arrays.copyOfRange(str, 0, startIndex));
            System.out.println(x + str[startIndex] + str[startIndex + 1]);
            System.out.println(x + str[startIndex + 1] + str[startIndex]);
            count += 2;
        } else {
            // Kein Basisfall
            for (int i = startIndex; i < str.length; i++) {
                swap(str, startIndex, i);
                permute(str, startIndex + 1);
                swap(str, startIndex, i);
            }
        }
    }

    public static void main(String[] args) {
        permute("0123456789");
        System.out.println(count);
    }
}
