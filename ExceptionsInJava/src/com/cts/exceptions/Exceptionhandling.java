package com.cts.exceptions;
import java.util.*;

public class Exceptionhandling {
	public static void main(String args[])
	{	
		
		try {
			Scanner sc= new Scanner(System.in);
			 int  num = sc.nextInt();
			 sc.close();
			 System.out.println("The number entered is :" + num);
		}
		catch(Exception f)
		{
			System.out.println("The entered value is not a number , please enter a number");
			
		}
		
		
			
		
	}
}
