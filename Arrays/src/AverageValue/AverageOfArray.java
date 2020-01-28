package AverageValue;

public class AverageOfArray
{
	public static void main(String arga[])
	{	
		int sum =0;
		int average = 0;
		int[] Temperature = {21,23,29,31,45,43};
		for(int i=0; i< Temperature.length; i++)
			{
				 sum = sum +Temperature[i];		
			}
		average = (sum/Temperature.length);
		System.out.println(sum);
		System.out.println(average);
		
	}
}

