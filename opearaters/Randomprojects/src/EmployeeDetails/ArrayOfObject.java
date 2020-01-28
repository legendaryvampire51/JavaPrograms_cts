package EmployeeDetails;
 class ArrayOfObject {
	public static void  main(String args[])
	{
		
		Employee[] employeeArray = new Employee[5];
		employeeArray[0]= new Employee(1,"Srikanth");
		employeeArray[1]= new Employee(2,"Rahul");
		employeeArray[2]= new Employee(3,"Sai teja");
		employeeArray[3]= new Employee(4,"Ravi teja");
		employeeArray[4]= new Employee(5,"Prabhu datta");
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(employeeArray[i].emp_id+"  "+employeeArray[i].emp_name);
		}
	}
}