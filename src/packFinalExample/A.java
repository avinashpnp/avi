package packFinalExample;

public class A {

	public final static int i = 100;
	public int a = 10;
	public int b = 20;

	public void add() {
		a = 30;
		//can't change final variable value
		// i=200;
		System.out.println(a + b + i);
	}
	public final void m1() {
		System.out.println("final implementation....");
	}
	public static void main(String[] args) {
		A aa = new A();
		aa.add();
		aa.m1();
	}
}
