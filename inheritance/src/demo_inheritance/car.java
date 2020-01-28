package demo_inheritance;

public class car extends machine {

	public void start() {
		
		System.out.println("Car has started.");
	}

	public void accelerate() {
		
		System.out.println("Car has accelerated.");
	}

	public void brake() {
		
		System.out.println("brakes are on.");
	}

	public void stop() {
	
		System.out.println("Car has stopped.");
	}

}
