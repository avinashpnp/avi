package packStringExamples;

public class A {
	
	public String city;//jvm will convert into like this -->String city=new String();
	//public String name=new String("Hello");
	public String name="Hello x";
	public void strExm() {
		System.out.println(city);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		A aa=new A();
		aa.strExm();
	}

}
