package Vowels;
import java.util.*;;
public class CountVowels {
		public static void main(String args[]) 
		{	int count = 0;
			System.out.print("Enter a Sentence:");
			Scanner sc = new Scanner(System.in);
		    String sen = sc.next();
		    char charArray[] = sen.toCharArray();
		    for(int i=0;i<charArray.length;i++)
		    {
		    	if(charArray[i] == 'a'|| charArray[i] == 'e'|| charArray[i] == 'i'|| charArray[i] == 'o'|| charArray[i] == 'u' ||charArray[i] == 'A'|| charArray[i] == 'E'|| charArray[i] == 'I'|| charArray[i] == 'O'|| charArray[i] == 'U' )
		    	count++;
		    }
		    sc.close();
		    System.out.println(count);
			
		}
}
