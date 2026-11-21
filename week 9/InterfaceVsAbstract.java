// This program demonstrates the difference between an abstract class and an interface.

// Abstract classes can hold state and provide shared behavior.
abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println(name + " is sleeping.");
	}

	public abstract void makeSound();
}

// Interfaces define capabilities that implementing classes agree to provide.
interface Flyable {
	int MAX_ALTITUDE = 10000;

	void fly();
}

// A Bird is an Animal and has the capability to fly.
class Bird extends Animal implements Flyable {
	public Bird(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(name + " says: Tweet! Tweet!");
	}

	@Override
	public void fly() {
		System.out.println(name + " is flying up to " + MAX_ALTITUDE + " feet.");
	}
}

public class InterfaceVsAbstract {
	public static void main(String[] args) {
		Bird myBird = new Bird("Tweety");

		myBird.sleep();
		myBird.makeSound();
		myBird.fly();
	}
}
