package packLoopsAndConditionalStatements;

public class A {

	
	
	public static void num(int a, int b) {
		if(a>b) {
			System.out.println(" a is big");
		}
		else if(a==b) {
			System.out.println(" a and b values are equale");
		}
		else {
			System.out.println(" b is big");
		}
	}
	
	public static void main(String[] args) {
		//num(11,10);
		//num(10,11);
	     num(10,10);
	}
}
