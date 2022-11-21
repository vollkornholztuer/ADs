package uebung02.aufgabe02.loes;

public class Ones {

    public static int ones(int n) {
        if (n <= 0) {
            return 0;
        } else {
            // if (n % 2 == 0) {
            // return ones(n / 2);
            // } else {
            // return 1 + ones(n / 2);
            // }
            return ones(n / 2) + n % 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(ones(17));
    }
}
