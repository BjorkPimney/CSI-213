package lab02;

import java.awt.Color;

/**
 * A {@code Cat} (a kind of {@link Mammal}) represents a cat.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Cat extends Mammal {

	/**
	 * The fur color of this {@code Cat}.
	 */
	protected Color furColor;

	/**
	 * Constructs a {@code Cat}.
	 * 
	 * @param bodyTemperature the body temperature of the {@code Cat} in Celsius
	 * @param furColor        the fur color of the {@code Cat}
	 */
	public Cat(double bodyTemperature, Color furColor) {
		super(bodyTemperature);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String sound() {
		// TODO make some change(s) below to make this method work correctly (this
		// method must not throw the UnsupportedOperationException).
		throw new UnsupportedOperationException();
	}

}
