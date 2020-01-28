package collections;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Neil");
		list1.add("Robb");
		list1.add("Lorex");
		list1.add("carat");
		list1.add("Piscal");
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("Wong");
		list1.addAll(list2);
		
		System.out.println(list1);
		
	}
	class Arraylist2
	{
		
	}
}
