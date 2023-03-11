package opps;

public class Employee {
	
	public String Name;
	public int EmpId;
	private static int Salary = 50000;
	
	public Employee() {
		System.out.println("Inside default Cons");
	}
	
	public Employee(String Var1,int Var2) {
		System.out.println("Insde Parameterised Constructor");
		Name = Var1;
		EmpId = Var2;
	}
	
	public void DisplayName() {
		
		System.out.println("Name of the employee is " +Name);
	}
	
	/*public static void DisplaySalary() {
		
		System.out.println("Salary of the employee is " +Salary);
	}*/
}
