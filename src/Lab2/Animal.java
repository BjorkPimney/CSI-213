package csi213.lab02;

import java.awt.Color;

/**
 * An {@code Animal} represents an animal.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
interface Animal {

	/**
	 * Returns a {@code String} representation of the sound that this {@code Animal}
	 * makes.
	 * 
	 * @return a {@code String} representation of the sound that this {@code Animal}
	 *         makes
	 */
	public String sound();

	/**
	 * Entry point of the program demonstrating {@code Animal}, {@code Mammal},
	 * {@code Dog}, and {@code Cat}.
	 * 
	 * @param args the command-line arguments (not used)
	 */
	public static void main(String[] args) {
		Dog d1 = new Dog(38.55, "Rocky");
		System.out.println("d1.sound()=" + d1.sound());

		Cat c1 = new Cat(38.23, Color.GRAY);
		System.out.println("c1.sound()=" + c1.sound());

		System.out.println(d1);
		Dog d2 = new Dog(38.94, "Apollo");
		System.out.println(d2);

		System.out.println(c1);
		Cat c2 = new Cat(39.12, Color.ORANGE);
		System.out.println(c2);
		System.out.println(new Cat(38.86, Color.DARK_GRAY));

		System.out.println("Mammal.count()=" + Mammal.count());
		System.out.println("Dog.count()=" + Dog.count());
		System.out.println("Cat.count()=" + Cat.count());
	}

}
