package opearaterspractise;
import java.util.Scanner;

public class binarycount {
	
	public static void main(String[] arhsd)
	
	{	
		Scanner data = new Scanner(System.in);
		int a = data.nextInt();
		data.close();
		System.out.println("The binary of the num entered is " + Integer.toBinaryString(a) );
		int result = countOne(a);
		System.out.print("Number of 1's in binarycode of the num entered is " + (result) );
	
		
	}

static int countOne(int b){
		int count = 0;
		while (b>0) {
			b= b&(b-1);
			count++;
		}
		return (count);
	}
}
