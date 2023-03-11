package opps;

public class Insurance extends Citizen {

	public int InsuranceId;

	public Insurance() {
		// super(); //Constructor of super and without super also it'll call 
		System.out.println("default Cons of Insurance");
	}
	public void print() {
		super.print();//It'll call immediate parent & it should be used only when you have parent
		System.out.println("Insurance Id is "+InsuranceId);
	}
	
}
