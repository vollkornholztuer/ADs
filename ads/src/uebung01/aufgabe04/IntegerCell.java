package uebung01.aufgabe04;

public class IntegerCell {

    private int number;
    private int numberResult;
    // private IntegerCell result;

    public IntegerCell() {
        // number = 0;
    }

    public IntegerCell(int n) {
        number = n;
    }

    public int sum(IntegerCell right) {
        numberResult = number + right.number;
        IntegerCell result = new IntegerCell(numberResult);
        return numberResult;
    }

    public int subtract(IntegerCell right) {
        numberResult = number - right.number;
        IntegerCell result = new IntegerCell(numberResult);
        return numberResult;
    }

    public int multiply(IntegerCell right) {
        numberResult = number * right.number;
        IntegerCell result = new IntegerCell(numberResult);
        return numberResult;
    }

    public int division(IntegerCell right) {
        numberResult = number / right.number;
        IntegerCell result = new IntegerCell(numberResult);
        return numberResult;
    }

    public String toString() {
        return "Result:" + numberResult;
    }

}
