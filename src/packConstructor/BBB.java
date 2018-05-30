package packConstructor;

public class BBB extends AAA {

	public int a=100;
	public int b=200;
	public void m1() {
		System.out.println("this is BBB ...m1");
	}
	
	public void mul() {
		System.out.println(this.a*super.b);
		//m1();
		this.m1();
		super.m1();
	}
	
	public static void main(String[] args) {
		BBB obj=new BBB();
		obj.add();
		obj.mul();
	}
}
