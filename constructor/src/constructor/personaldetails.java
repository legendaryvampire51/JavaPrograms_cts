package constructor;

public class personaldetails {
	
	String name;
	int age;

	personaldetails(){
		this.age = 21;
		this.name ="Srikanth Reddy";
		
	}
	personaldetails(String n, int a){
		this.age = a;
		this.name = n;
		
	}
	
	public static void main(String[] args)
	
	{
		personaldetails q = new personaldetails();
		personaldetails w = new personaldetails("Srikanth",22);
		System.out.println(q.name + " is " + q.age);// using reference
		System.out.println(w.name + " is " + w.age);// using reference 
		
	}

}
