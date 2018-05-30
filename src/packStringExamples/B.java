package packStringExamples;

public class B {
	
	//string object value can't modify because of immutable--cp
	public static String str="Hi ";
	public void m() {
		System.out.println(str);
		System.out.println(str.concat("xyz"));
		System.out.println(str);
	}
	public static void main(String[] args) {
		B b=new B();
		b.m();
	}

}
