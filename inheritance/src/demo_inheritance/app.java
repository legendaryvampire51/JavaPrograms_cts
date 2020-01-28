package demo_inheritance;

public class app {
	
		public static void main(String[] args) {
			
			machine obj= new machine();
			obj.start();
			obj.stop();
			
			car benz  = new car();
			System.out.println("Car number is" + benz.name);
			benz.start();
			benz.accelerate();
			benz.brake();
			benz.stop();
		}
}
