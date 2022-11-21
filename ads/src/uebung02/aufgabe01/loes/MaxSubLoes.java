package uebung02.aufgabe01.loes;

// import java.util.Arrays;

public class MaxSubLoes {

    public static int maxSubSumRec(int[] a, int left, int right) {

        // Basisfall: Array der Länge 1
        if (right == left) {
            return a[left] < 0 ? 0 : a[left];
            /*
             * if(a[left] < 0) {
             * return 0;
             * } else {
             * return a[left];
             * }
             */
        }

        // Halbiere Array in linkes und rechtes Teilarray
        // berechne rekurssiv max Sub Wert jeder Hälfte

        int mid = (left + right) / 2;
        // int[] arrayLeft = Arrays.copyOfRange(a, left, mid + 1);
        // int[] arrayRight = Arrays.copyOfRange(a, mid + 1, right);
        //
        // int maxLeftSum = maxSubSumRec(arrayLeft, 0, arrayLeft.length - 1);
        // int maxRightSum = maxSubSumRec(arrayRight, 0, arrayRight.length - 1);

        int maxLeftSum = maxSubSumRec(a, left, mid);
        int maxRightSum = maxSubSumRec(a, mid + 1, right);

        // die Berechnung erfolgt jeweils durch eine for-Schleife
        int maxLeftArray = 0; // größte bisher gefundene Summe links
        int sumLeft = 0; // laufende Summe Links
        for (int i = mid; i >= left; i--) {
            sumLeft += a[i];
            if (sumLeft > maxLeftArray) {
                maxLeftArray = sumLeft;
            }
        }

        int maxRightArray = 0; // größte bisher gefundene Summe rechts
        int sumRight = 0; // laufende Summe rechts
        for (int i = mid + 1; i <= right; i++) {
            sumRight += a[i];
            if (sumRight > maxRightArray) {
                maxRightArray = sumRight;
            }
        }

        int maxMidSum = maxLeftArray + maxRightArray;

        return Math.max(Math.max(maxLeftSum, maxRightSum), maxMidSum);
    }

    public static void main(String[] args) {
        int[] a = { 3, -4, 2, 2, -3, 1, 3, -2 };
        System.out.println(maxSubSumRec(a, 0, a.length - 1));
    }

}
