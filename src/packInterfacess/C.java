package packInterfacess;

public class C implements I2{
	
	public void add() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		C c=new C();
		c.add();
	}

}
