package labproject5.fraction;

public class FractionTest {

	public static void main(String[] args) {
		
		// creates new fraction and prints it out
		Fraction f0 = new Fraction (4, 6);
		System.out.println(f0);
		
		//creates 3 new fractions
		Fraction f1 = new Fraction (5, 8);
		Fraction f2 = new Fraction (1, 9);
		Fraction f3 = new Fraction ();
		
		//add 2 fractions and print
		f3 = f3.add(f1, f2);
		System.out.println(f1 + " + " + f2 + " = " + f3);
		
		//subtract 2 fractions and print
		f3 = f3.subtract(f1, f2);
		System.out.println(f1 + " - " + f2 + " = " + f3);
		
		//multiply 2 fractions and print
		f3 = f3.multiply(f1, f2);
		System.out.println(f1 + " * " + f2 + " = " + f3);
		
		//divide 2 fractions and print
		f3 = f3.divide(f1, f2);
		System.out.println(f1 + " / " + f2 + " = " + f3);




	}

}
