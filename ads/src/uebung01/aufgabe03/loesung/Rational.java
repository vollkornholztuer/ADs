package uebung01.aufgabe03.loesung;

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
		int d = this.denominator * right.denominator;
		int n = this.numerator * right.denominator + right.numerator * this.denominator;

		Rational resultRational = new Rational(n, d);

		return resultRational;
	}

	// Subtract two Rational numbers
	// return a Rational result object
	public Rational subtract(Rational right) {
		int d = this.denominator * right.denominator;
		int n = this.numerator * right.denominator - right.numerator * this.denominator;

		Rational resultRational = new Rational(n, d);

		return resultRational;
	}

	// Multiply two Rational numbers
	// return a Rational result object
	public Rational multiply(Rational right) {
		int n = this.numerator * right.numerator;
		int d = this.denominator * right.denominator;
		return new Rational(n, d);
	}

	// Divide two Rational numbers
	// return a Rational result object
	public Rational divide(Rational right) {
		int n = numerator * right.denominator;
		int d = denominator * right.numerator;

		Rational resultRational = new Rational(n, d);
		return resultRational;
	}

	// Reduce the fraction
	private void reduce() {
		assert (denominator != 0);

		int teiler = ggT.ggT(Math.abs(this.numerator), Math.abs(this.denominator));
		if (this.numerator < 0 && this.denominator < 0) {
			// this.numerator = Math.abs(this.numerator);
			// this.denominator = Math.abs(this.denominator);
			teiler = teiler * -1;
		}
		this.numerator = this.numerator / teiler;
		this.denominator = this.denominator / teiler;

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