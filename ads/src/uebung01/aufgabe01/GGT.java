package uebung01.aufgabe01;

public class GGT {

    private static int teiler = 0;
    private static int rest;

    public static int restBeiDivision(int a, int b) {

        while (b > 0) {
            rest = a % b;
            a = b;
            b = rest;

            restBeiDivision(a, b);
        }

        return a;
    }

}
