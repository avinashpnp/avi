package packHybrid;

public class C implements I2, I3 {

	public void add() {

		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		
		C c=new C();
		c.add();

	}

}
