package packMethodChanging;

public class C {
	
	public void m1() {
		System.out.println("Hello Avinash");
		m2();
		m3();
		m4();
	}

	public static void m2() {
		System.out.println("Hello Kesaw");
		m4();
	}
	
	public static void m3() {
		
		System.out.println("22");
	}
	public static void m4() {
		System.out.println("33");
		
		
	}
	public static void main(String[] args) {
		C cc=new C();
		cc.m1();
	}

}
