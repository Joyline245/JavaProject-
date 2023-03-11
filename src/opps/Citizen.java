package opps;

public class Citizen extends Person {
	public int SSN;
	
	public Citizen() {
		super(); //Its good habit always call in constructor
		System.out.println("default Cons of Citizen");
	}
	
	public Citizen(String var1,int var2,String var3,int var4)
	{
		System.out.println("Inside Param cons of citizen ");
		this.Name= var1;
		this.Age = var2;
		this.Countryname = var3;
		this.SSN = var4;
	}
public void print () {
	System.out.println("SSN is " +SSN);
}
}
