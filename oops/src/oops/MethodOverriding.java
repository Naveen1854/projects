package oops;

class Vehicle{
	 void run() {
		System.out.println("Vehicles are used to travel");
	}
}

class Bike extends Vehicle{
	@Override
	 void run() {
		System.out.println("Bike is starting");
	}
}

class Bus extends Vehicle{
	@Override
	void run() {
		System.out.println("Bus is overloaded");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		Bus bus = new Bus();
		bus.run();
	}
}
