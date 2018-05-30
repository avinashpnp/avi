package pack1;

public class SampleClass {
	
	
	//user defined method
	public void addition() {
		System.out.println(11+22);//type syso--->ctrl+space bar
	}
	public void subtraction() {
		System.out.println(11-22);//type syso--->ctrl+space bar
	}
	public void multiplication() {
		System.out.println(11*22);//type syso--->ctrl+space bar
	}
	
	public void myDetails() {
		System.out.println("my name is avinash");
	}
	
	
//this is execution engine or execution entry point ...this is jvm method(jvm nothing but java virtual machine)
	public static void main(String[] args) {		
		SampleClass obj=new SampleClass();
		//calling userdefined method using object
		obj.addition();
		obj.myDetails();
		
		
	}

}
 