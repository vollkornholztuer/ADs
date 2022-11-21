package uebung01.aufgabe05;

public class FakultaetTest {

    public static void main(String[] args) {

        int n = 6;
        System.out.println("Test");

        int result = Fakultaet.fakultaetIterativ(n);
        int result2 = Fakultaet.fakultaetRekursiv(n);

        System.out.println(result);
        System.out.println(result2);

    }

}
