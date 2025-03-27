
package studio7;


public class Fraction {

	private int numerator;
	private int denominator;
	private double value;
	private boolean divisible;
	
	/**
	 * 
	 * @param n numerator
	 * @param d denominator
	 */
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
		value = (double)n/d;
		for (int i = numerator; i>0; i--) {
			if (numerator % i == 0 && denominator % i ==0)
				divisible = true;}
	}
	
	public String toString() {
		return "Fraction: " + numerator + "/" + denominator + " = " + value ;
	}
	
	public static Fraction addFraction(Fraction F1, Fraction F2) {
		Fraction sum = new Fraction(F1.numerator + F2.numerator, F1.denominator*F2.denominator);
		return sum;
	}
	
	public Fraction simplified() {
		int n = 0;
		int d = 0;
		for (int i = numerator; i>1; i--) {
			if (numerator % i == 0 && denominator % i ==0) {
				divisible = true;
				n = numerator / i;
				d = denominator /i;
				break;}
			
				
		}
		Fraction Fs = new Fraction(n,d);
		return Fs;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction F1 = new Fraction(234,23);
		Fraction F2 = new Fraction(223,675);
		System.out.println(F1);
		System.out.println(F2);
		Fraction F3 = addFraction(F1,F2);
		System.out.println(F3);

	}

}
