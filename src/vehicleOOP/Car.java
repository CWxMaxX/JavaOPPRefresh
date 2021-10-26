package vehicleOOP;

public class Car extends Vehicle {

	public Car(int wheels, double engineCpacity, int gears, double weight) {
		super(wheels, engineCpacity, gears, weight);
		
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
		System.out.println("This is a Car");
	}
	

	
}
