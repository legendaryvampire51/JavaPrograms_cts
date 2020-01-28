package logicalopearaters;
import java.util.Scanner;
public class loginDetailsCheck

	{
			public static void main(String[] dsfd) 
	
		{	
	
				String UserId = "legendaryvampire51";
				String Password = "abcdef";
				Scanner user = new Scanner(System.in);
				
				System.out.print("Enter Username : ");
				String tempUserId = user.nextLine();
				System.out.print("Enter Password : ");
				String tempPassword = user.nextLine();
				user.close();
				
				
			
				
				loginDetailsVerify(UserId, Password, tempUserId, tempPassword);
				System.out.print(loginDetailsVerify(UserId, Password, tempUserId, tempPassword));
				
	
		}
			public static String loginDetailsVerify(String a, String b, String c, String d)
			{
				if(a.equals(c) && b.equals(d))
				{
					return "Welcome";
				}
				else 
					return "Try again";
			}
	}
