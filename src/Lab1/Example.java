package csi213.lab01;

/**
 * The {@code Example} class provides examples of arithmetic operations.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Example {

	/**
	 * Returns the integer quotient when {@code a} is divided by {@code b}.
	 * 
	 * @param a the dividend
	 * @param b the divisor (a positive integer value)
	 * @return the integer quotient when {@code a} is divided by {@code b}
	 */
	public static int quotient(int a, int b) {
		return a/b;
	}

	/**
	 * Returns the integer remainder when {@code a} is divided by {@code b} (the
	 * remainder must be a non-negative value smaller than {@code b}).
	 * 
	 * @param a the dividend
	 * @param b the divisor (a positive integer value)
	 * @return the integer remainder when {@code a} is divided by {@code b}
	 */
	public static int remainder(int a, int b) {
		int r = a%b;
		if(r<0) {
			r += b; // If the remainder is less than 0, we set r to add itself to b until it is no longer negative.
		}
		return r;
	}

	/**
	 * Entry point of the {@code Example} class.
	 * 
	 * @param args the command-line arguments (not used)
	 */
	public static void main(String[] args) {
		System.out.println(quotient(4, 2));
		System.out.println(quotient(3, 2));

		System.out.println(remainder(4, 2));
		System.out.println(remainder(3, 2));

		System.out.println(remainder(-4, 2));
		System.out.println(remainder(-3, 2));
		System.out.println(remainder(-5, 4));
	}

}
