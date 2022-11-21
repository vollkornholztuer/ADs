package uebung01.aufgabe07;

public class BadRecursion {

    static int bad(int n) {
        if (n == 0) {
            return 0;
        } else {
            return bad(n / 3 + 1) + n - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(bad(0));
        System.out.println(bad(1)); // Sobald das else-Statement aufgerufen wird, kann n niemals kleiner als 1
                                    // werden - Damit hat man eine Endlosschleife

        System.out.println(bad(2)); // n = 1
        System.out.println(bad(3)); // n = 3 --> n = 2
        System.out.println(bad(4)); // n = 4 --> n = 2
        System.out.println(bad(5)); // n = 5 --> n = 2
    }

}
