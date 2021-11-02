package labproject5.fraction;

public class Fraction {

	
	private int numerator;
	private int denominator;
    /*
     * Constructor with denominator and numerator
     */
	public Fraction(int n, int d) {
		
		numerator = n;
		denominator = d;
		
		reduce();
	}
	
	/*
	 * No argument constructor
	 */
	public Fraction() {
		
		numerator = 1;
		denominator = 1;
	}
	
	/*
	 * Reduces fraction
	 */
	private void reduce() {
		 
		int GCD = numerator;
		
		while (GCD > 1) {
			
			if (numerator % GCD == 0 && denominator % GCD == 0) {
				break;
			}
			
			GCD--;
		}
		
		numerator = numerator / GCD;
		denominator = denominator / GCD;
	}
	/*
	 *	 returns fraction to string ex. 4 / 5
	 */
	public String toString() {
		
		return numerator + "/" + denominator;
	}
	
	/*
	 * adds 2 fractions together returning new fraction
	 */
	public Fraction add(Fraction f1, Fraction f2) {
		
		int denom = f1.denominator * f2.denominator;
		
		int num1 = f1.numerator * f2.denominator;
		int num2 = f2.numerator * f1.denominator;
		
		Fraction answer = new Fraction(num1+num2, denom);
		
		return answer;
			
	}
	
	/*
	 * subtracts 2 fractions together returning new fraction
	 */
	public Fraction subtract(Fraction f1, Fraction f2) {
		
		int denom = f1.denominator * f2.denominator;
		
		int num1 = f1.numerator * f2.denominator;
		int num2 = f2.numerator * f1.denominator;
		
		Fraction answer = new Fraction (num1-num2, denom);
		
		return answer;
	}
	
	/*
	 * multiplies 2 fractions together returning new fraction
	 */
	public Fraction multiply(Fraction f1, Fraction f2) {
		
		int denom = f1.denominator * f2.denominator;
		
		int num = f1.numerator * f2.numerator;
		
		Fraction answer = new Fraction(num, denom);
		
		return answer;
	}
	
	/*
	 * divides 2 fractions together returning new fraction
	 */
	public Fraction divide (Fraction f1, Fraction f2) {
		
		int num = f1.numerator * f2.denominator;
		
		int denom = f1.denominator * f2.numerator;
		
		Fraction answer = new Fraction (num, denom);
		
		return answer;
	}

	
}
