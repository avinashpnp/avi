package packMultiple;

public class C implements I4 {
	
	public void add() {
		System.out.println(a+b+c+d);
		
	}

	public static void main(String[] args) {

		C c=new C();
		c.add();
	}

}
