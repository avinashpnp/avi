package packConstructor;

public class AA {
	public int a;
	public AA(int a) {
		this.a=a;
		
	}
	
	/*public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	public void div(int a, int b) {
		System.out.println(a/b);
	}*/
	public void add(int b) {
		System.out.println(a+b);
	}
	public void mul(int b) {
		System.out.println(a*b);
	}
	public void div(int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
	/*AA obj=new AA();
	obj.add(10, 11);
	obj.mul(10, 12);
	
	obj.div(10, 5);*/
		AA obj=new AA(10);
		obj.add(11);
		obj.mul(12);
		obj.div(5);
	}

}
