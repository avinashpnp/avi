package packNonStaticAndStaticMethods;

public class A {
	
	//parameterless non static method
	public void m1() {
		
	}
	//parameterless static method
	public static void m2() {
		
	}
	
	//parameterized non static method
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	//parameterized static method
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		A obj=new A();
		obj.m1();
		m2();
		obj.add(11, 22);
		obj.add(121, 321);
		mul(121, 321);
	}

}
