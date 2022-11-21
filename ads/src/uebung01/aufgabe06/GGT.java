package uebung01.aufgabe06;

public class GGT {

    public static int restBeiDivision(int a, int b) {

        if (b > 0) {
            return a / restBeiDivision(b, a % b);
        } else {
            return a;
        }
    }

}
