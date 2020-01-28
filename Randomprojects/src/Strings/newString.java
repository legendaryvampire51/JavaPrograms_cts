package Strings;

public class newString {
	String sentence = "Welcome to advance metaphysics colony";
	public static void  main(String args[])
	{
		String sentence = "Welcome to advance metaphysics colony";
		int lengthOfSentence = sentence.length();
		System.out.println("String length is : " + lengthOfSentence);
		
		char firstChar = sentence.charAt(5);
		System.out.println("Character at 5 th position: " + firstChar);
		
		for(int i = 0; i<sentence.length(); i++)
		{
			System.out.print(sentence.charAt(i));
		}
		System.out.print("      ");
		ReplaceChar s2 = new ReplaceChar();
		String replace = s2.replaced(); 
		System.out.println(replace);
		
	}
}
