package packMethodChanging;

public class B {

	public void m3() {
		System.out.println("Hello Avinash");
	}

	public static void m4() {
		B bb=new B();
		bb.m3();
		System.out.println("Hello Kesaw");
		A aa= new A();
		aa.m1();
		aa.m2();
		
	}

	public static void main(String[] args) {
		
		m4();
}

}
