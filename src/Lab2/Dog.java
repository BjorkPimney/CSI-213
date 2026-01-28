package csi213.lab02;

/**
 * A {@code Dog} (a kind of {@link Mammal}) represents a dog.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Dog extends Mammal {

	/**
	 * The name of this {@code Dog}.
	 */
	protected String name;

	/**
	 * Constructs a {@code Dog}.
	 * 
	 * @param bodyTemperature the body temperature of the {@code Dog} in Celsius
	 * @param name            the name of the {@code Dog}
	 */
	public Dog(double bodyTemperature, String name) {
		super(bodyTemperature);
		this.name = name;
	}

	/**
	 * Returns a {@code String} representation of this {@code Dog}.
	 * 
	 * @return a {@code String} representation of this {@code Dog}
	 */
	@Override
	public String toString() {
		return String.format("[bodyTemperature=%.1f, name=%s]", bodyTemperature, name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String sound() {
		return "Woof!";
	}

}
