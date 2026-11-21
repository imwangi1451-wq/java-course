// Demonstrates upcasting, downcasting, and safe type checks with instanceof.
class Vehicle {}

class Car extends Vehicle {
	public void openTrunk() {
		System.out.println("Trunk opened.");
	}
}

class Bike extends Vehicle {}

public class CastingDemo {
	public static void main(String[] args) {
		// Upcasting is implicit and safe.
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		System.out.println("Upcasting successful.");

		// Casting a Bike to Car would throw ClassCastException:
		// Car myCar = (Car) v2;
		// myCar.openTrunk();

		// Check the runtime type before downcasting.
		System.out.println("\nChecking types safely...");
		if (v1 instanceof Car) {
			Car c1 = (Car) v1;
			c1.openTrunk();
		}

		if (v2 instanceof Car) {
			System.out.println("This will not print.");
		} else {
			System.out.println("v2 is not a Car, it is a Bike. Downcasting prevented!");
		}
	}
}
