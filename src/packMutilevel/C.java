package packMutilevel;

public class C implements I3{
	
	public void add() {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		C c=new C();
		c.add();
	}

}
