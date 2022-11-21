package uebung03.aufgabe03;

public class Exponentialfunktion {

    static long product = 1;

    public static long pow(long x, int n) {
        long startTime = System.nanoTime();

        // Laufzeit = O(n)
        for (int i = 0; i < n; i++) {
            product *= x;
        }
        long endTime = System.nanoTime();
        System.out.println("Laufzeit: " + (endTime - startTime) + " Nanosekunden");
        return product;
    }

    public static void main(String[] args) {
        pow(2, 20);
        pow(2, 100);
        pow(2, 500);
        pow(2, 1000);
        pow(2, 10000);
        pow(10, 20);
        pow(10, 100);
        pow(10, 500);
        pow(10, 1000);
        pow(10, 10000);
        pow(10, 1000000000);
    }

}
