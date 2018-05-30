package packNonStaticAndStaticMethods;

public class Kesaw {
	
	public static void main(String[] args) {
		Avinash aa=new Avinash();
		aa.m1();
		Avinash.m2();
		aa.m3(11, 22);
		Avinash.m4(0,1);
	}

}
