package vehicleOOP;

public abstract class Vehicle {
	protected int wheels;
	protected double engineCpacity;
	protected int gears;
	protected double weight;
	public Vehicle(int wheels, double d, int gears, double e) {
		super();
		this.wheels = wheels;
		this.engineCpacity = d;
		this.gears = gears;
		this.weight = e;
	}
	
	abstract void status();
	abstract void vehicleType();
	

}
