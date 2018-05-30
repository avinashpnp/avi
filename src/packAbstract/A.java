package packAbstract;

public abstract  class A {
	public int a;//declaration variable
	public int b=20;//initialization variable
	public static int c=30;
	//public abstract int d=90;
	
	//m1 is implemented method
	public void m1() {
		System.out.println(a+b+c);
	}
	public static void mm1() {
		//A obj=new A();
		//System.out.println(a+b+c);
	}
	
	//unimplemented methods
	public abstract void m2();
	public abstract void m3();


}
