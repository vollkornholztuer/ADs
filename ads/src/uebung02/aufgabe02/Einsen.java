package uebung02.aufgabe02;

public class Einsen {

    static int returnEinsen(int number) {
        if (number == 0) {
            return 0;
        } else {
            int rest = number % 2;
            int result = number / 2;

            return returnEinsen(result) + rest;
        }
    }

    public static void main(String[] args) {
        System.out.println(returnEinsen(3));
    }

}
