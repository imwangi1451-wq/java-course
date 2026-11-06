// This program demonstrates Method Overriding and the 'super' keyword.

// =====================================================================
// SUPERCLASS
// =====================================================================
class OverridingDemoEmployee {
	// Protected field
	protected String name;
	protected double baseSalary;

	// Constructor
	public OverridingDemoEmployee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// Method to calculate salary.
	public double calculateSalary() {
		return baseSalary;
	}

	// Method to display info.
	public void displayinfo() {
		System.out.println("Name: " + name);
		System.out.println("Base Salary: KSh " + baseSalary);
	}
}

// =====================================================================
// SUBCLASS
// =====================================================================
class Manager extends OverridingDemoEmployee {
	// A field unique to Manager.
	private double bonus;

	// Constructor
	public Manager(String name, double baseSalary, double bonus) {
		// Call the Employee constructor.
		super(name, baseSalary);

		// Set the Manager-specific field.
		this.bonus = bonus;
	}

	// OVERRIDING the calculateSalary method.
	// We use the @Override annotation to tell the compiler we are overriding.
	@Override
	public double calculateSalary() {
		// Use 'super' to call the parent's version of the method.
		double base = super.calculateSalary();

		// Add the bonus to the base salary.
		return base + bonus;
	}

	// OVERRIDING the displayInfo method.
	@Override
	public void displayinfo() {
		// Call the parent's displayInfo first.
		super.displayinfo();

		// Then add Manager-specific information.
		System.out.println("Bonus: KSh " + bonus);
		System.out.println("Total Salary: KSh " + calculateSalary());
	}
}

// =====================================================================
// MAIN CLASS
// =====================================================================
public class OverridingDemo {
	public static void main(String[] args) {

		// Create a regular Employee.
		OverridingDemoEmployee emp = new OverridingDemoEmployee("Alice", 50000);
		System.out.println("=== EMPLOYEE ===");
		emp.displayinfo();
		System.out.println("Calculated Salary: " + emp.calculateSalary());

		System.out.println();

		// Create a Manager.
		Manager mgr = new Manager("Bob", 80000, 20000);
		System.out.println("=== MANAGER ===");
		mgr.displayinfo();
		System.out.println("Calculated Salary: " + mgr.calculateSalary());
	}
}
