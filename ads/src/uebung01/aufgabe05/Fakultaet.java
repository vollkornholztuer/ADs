package uebung01.aufgabe05;

public class Fakultaet {

    static int resultRecursive = 1;
    static int resultIterative = 1;

    public static int fakultaetIterativ(int n) {
        for (int i = n; n >= 1; n--) {
            resultIterative *= n;
        }
        return resultIterative;
    }

    public static int fakultaetRekursiv(int n) {

        if (n >= 1) {
            return n * fakultaetRekursiv(n - 1);
        } else {
            return 1;
        }

    }

    // public String toString() {
    // return "Result: " + result;
    // }
}