package opps;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee emp1 = new Employee();
		emp1.Name = "Joy";
		emp1.EmpId = 1000 ;		
		emp1.DisplayName();
		
		Employee emp2 = new Employee();
		emp2.Name = "Suvith";
		emp2.EmpId = 1001;
		emp2.DisplayName();
		
		Employee emp3 = new Employee("Lucas",1002);
		emp3.DisplayName();*/
		
		System.out.println("*****Creating ct1");
		Citizen ct1 = new Citizen();
		ct1.Name = "JOYLINE";
		ct1.Age = 27;
		ct1.SSN = 12345;
		ct1.Countryname = "INDIA";
		ct1.print();
		
		System.out.println("*****Creating ct2");
		Citizen ct2 = new Citizen("Suvith",28,"India",98765);
		ct2.print();
		
		System.out.println("*****Creating obj1");
		Insurance obj1 = new Insurance();
		obj1.InsuranceId = 3000;
		obj1.SSN = 999;
		obj1.print();
		
	}

}
