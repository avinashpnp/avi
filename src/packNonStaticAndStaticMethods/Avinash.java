package packNonStaticAndStaticMethods;

public class Avinash {

	public void m1() {

	}

	public static void m2() {

	}

	public void m3(int a, int b) {
		System.out.println(a - b);
	}

	public static void m4(int a, int b) {
		System.out.println(a / b);
	}
	public static void main(String[] args) {
		Avinash aa=new Avinash();
		aa.m1();
		m2();
		aa.m3(22,33);
		m4(12,6);
		
		
	}

}
