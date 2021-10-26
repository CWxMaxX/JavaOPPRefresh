package vehicleOOP;

public class Bike extends Vehicle {


	public Bike(int wheels, double d, int gears, double e) {
		super(wheels, d, gears, e);
		
	}

	@Override
	void status() {
		System.out.println("Details");
		System.out.println(wheels);
		System.out.println(engineCpacity);
		System.out.println(gears);
		System.out.println(weight);
		
	}
	void vehicleType() {
		System.out.println("This is a Bike");
	}

}
