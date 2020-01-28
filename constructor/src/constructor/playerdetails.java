package constructor;

public class playerdetails {
		String name; 
		int dob, age,century, halfcentury;
		
		playerdetails(){
			this.name = "Shikhar Dhawan";
			this.dob =1985 ;
			this.age = 33;
			this.century= 16;
			this.halfcentury= 27; 
			System.out.println(this.name + "is born in " + this.dob +". His age is "+this.age );
		}
		
		public void main(String[] args) {
			
			playerdetails q = new playerdetails();
			
		}
}
