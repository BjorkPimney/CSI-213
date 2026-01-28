package lab02;

/**
 * A {@code Mammal} represents an animal with a body temperature. Subclasses
 * (e.g., {@code Dog}, {@code Cat}) should override {@link #sound()}.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Mammal implements Animal {

	/**
	 * The body temperature of this {@code Mammal} in Celsius.
	 */
	protected double bodyTemperature;

	/**
	 * Constructs a {@code Mammal}.
	 * 
	 * @param bodyTemperature the body temperature of the {@code Mammal} in Celsius
	 */
	public Mammal(double bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}

	/**
	 * Returns the number of {@code Mammal}s constructed so far.
	 * 
	 * @return the number of {@code Mammal}s constructed so far
	 */
	public static int count() {
		// TODO make some change(s) within this class to make this method work correctly
		// (this method must not throw the UnsupportedOperationException).
		throw new UnsupportedOperationException();
	}

	// TODO remove the following method (because it does not perform useful tasks)
	// and make some additional change(s) to eliminate compile errors.
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String sound() {
		throw new UnsupportedOperationException(
				"Mammal.sound() must be overridden by a concrete subclass (e.g., Dog or Cat).");
	}

}
