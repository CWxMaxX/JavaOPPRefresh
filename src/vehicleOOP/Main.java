package vehicleOOP;

public class Main {

	public static void main(String[] args) {
		Vehicle gtr = new Car(4,2,5,2);
		
		gtr.vehicleType();
		gtr.status();
		
		Vehicle hornet = new Bike(2,0.15,3,0.2);
		
		hornet.vehicleType();
		hornet.status();

	}

}
