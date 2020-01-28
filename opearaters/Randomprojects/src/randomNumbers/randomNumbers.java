package randomNumbers;
import java.util.Random;

public class randomNumbers {
	public static void main(String[] args) {
		System.out.print("Random number generator : ");
		Random random = new Random();
		System.out.println(random.nextGaussian());
	}
}
