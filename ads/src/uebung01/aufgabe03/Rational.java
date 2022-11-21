package uebung01.aufgabe03;


// Definition of class Rational

public class Rational {
	private int numerator; // Zaehler
	private int denominator; // Nenner

	// Initialize numerator to 0 and denominator to 1
	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	// Initialize numerator part to n and denominator part to 1
	public Rational(int n) {
		numerator = n;
		denominator = 1;
	}

	// Initialize numerator part to n and denominator part to d
	public Rational(int n, int d) {
		assert (d != 0);

		numerator = n;
		denominator = d;
		reduce();
	}

	// Add two Rational numbers
	public Rational sum(Rational right) {
		int originalDenominator = denominator; // original denominator
		int rightDenominator = right.denominator; // right denominator

		int newOriginalNumerator = numerator * rightDenominator;
		int newOriginalDenominator = denominator * rightDenominator;

		int newRightNumerator = right.numerator * originalDenominator;
		int newRightDenominator = right.denominator * originalDenominator;

		int resultNumerator = newOriginalNumerator + newRightNumerator;
		int resultDenominator = newOriginalDenominator;

		Rational restultRational = new Rational(resultNumerator, resultDenominator);

		return restultRational;
	}

	// Subtract two Rational numbers
	// return a Rational result object
	public Rational subtract(Rational right) {
		int originalDenominator = denominator; // original denominator
		int rightDenominator = right.denominator; // right denominator

		int newOriginalNumerator = numerator * rightDenominator;
		int newOriginalDenominator = denominator * rightDenominator;

		int newRightNumerator = right.numerator * originalDenominator;
		int newRightDenominator = right.denominator * originalDenominator;

		int resultNumerator = newOriginalNumerator - newRightNumerator;
		int resultDenominator = newOriginalDenominator;

		Rational resultRational = new Rational(resultNumerator, resultDenominator);
		return resultRational;
	}

	// Multiply two Rational numbers
	// return a Rational result object
	public Rational multiply(Rational right) {
		int newNumerator = numerator * right.numerator;
		int newDenominator = denominator * right.denominator;

		Rational resultRational = new Rational(newNumerator, newDenominator);
		return resultRational;
	}

	// Divide two Rational numbers
	// return a Rational result object
	public Rational divide(Rational right) {
		int newNumerator = numerator * right.denominator;
		int newDenominator = denominator * right.numerator;

		Rational resultRational = new Rational(newNumerator, newDenominator);
		return resultRational;
	}

	// Reduce the fraction
	private void reduce() {
		assert (denominator != 0);

		if (numerator > denominator) {
			for (int i = numerator; i == 2; i--) {
				if (numerator % i == 0 && denominator % i == 0) {
					numerator /= i;
					denominator /= i;
				}
			}
		} else if (numerator < denominator) {
			for (int i = denominator; i == 2; i--) {
				if (numerator % i == 0 && denominator % i == 0) {
					numerator /= i;
					denominator /= i;
				}
			}
		} else {
			int x = denominator;
			denominator /= x;
			numerator /= x;
		}

		assert (denominator != 0);
	}

	public void toScreen() {
		System.out.println("Wert " + this.toString());
	}

	// Return String representation of a Rational number
	public String toString() {
		return numerator + "/" + denominator;
	}

}