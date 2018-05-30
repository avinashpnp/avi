     package packStringExamples;

public class C {
	//stringbuffer object value can modify because of mutable-->ncps
	//StringBuffer str="Hello";
    //public static	StringBuffer str=new StringBuffer("Hello");-->Heap Non Constant Pool
    public 	StringBuffer str=new StringBuffer("Hello");//-->Stack Non Constant Pool
	
	public void m() {
		System.out.println(str);
		System.out.println(str.append(" xyz"));
		System.out.println(str);
	}

	public static void main(String[] args) {
		C obj=new C();
		obj.m();
	}
}
