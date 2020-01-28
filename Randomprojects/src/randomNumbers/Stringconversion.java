package randomNumbers;
import java.util.Scanner;
public class Stringconversion {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		a.close();
		String s = a.nextLine();
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
	}				
}
