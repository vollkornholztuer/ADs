package uebung02.aufgabe01;

import java.util.Arrays;

public class MaximumSubsequence {

    static int maxSubSumRec(int[] a) {
        // Basisfall: Array der Länge 1

        if (a.length == 1) {
            if (a[0] < 0) {
                return 0;
            } else {
                return a[0];
            }
        }

        // Halbiere Array in linkes und rechtes Teilarray
        // berechne rekursiv mas Sub Wert jeder Hälfte
        int[] arrayLeftHalf = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] arrayRightHalf = Arrays.copyOfRange(a, (a.length / 2), a.length);

        int maxLeftSum = maxSubSumRec(arrayLeftHalf);
        int maxRightSum = maxSubSumRec(arrayRightHalf);

        // die Berechnung erfolgt jeweils durch eine for-Schleife
        int maxLeftArray = 0;
        for (int i = 0; i < arrayLeftHalf.length; i++) {
            maxLeftArray += arrayLeftHalf[i];
        }

        int maxRightArray = 0;
        for (int i = 0; i < arrayRightHalf.length; i++) {
            maxRightArray += arrayRightHalf[i];
        }

        // nehme das Maximum der 3 Summen
        return Math.max(maxLeftSum, Math.max(maxRightSum, maxLeftArray + maxRightArray));

    }

}
