package uebung01.aufgabe04;

public class IntegerCellTest {

    public static void main(String[] args) {
        IntegerCell i = new IntegerCell(30);
        IntegerCell j = new IntegerCell(50);
        int resultat = i.sum(j);
        System.out.println(resultat);

    }
}