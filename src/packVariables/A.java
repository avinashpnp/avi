package packVariables;

public class A {

	//instance or global or concrete or non static
	int a;//declaration
	int b=10;//initialization
	static int e;//static or class variables
	public void add() {
		int c=111;
		//static int d=89;
		System.out.println(a+b+c+e);
	}
	public void sub() {
		//System.out.println(a-b-c); sub can't access add method variables
		System.out.println(a-b-e);
	}
	
}
