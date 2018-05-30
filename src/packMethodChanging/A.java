package packMethodChanging;

public class A {
	
	public void m1() {
		System.out.println("Hello Avinash");
	}
	
	public void m2() {
	
	
		System.out.println("Hello Kesaw");
		//m1();
	}
	
	
	public static void main(String[] args) {
		A a=new A();
		//a.m1();
		a.m2();
	}

}
