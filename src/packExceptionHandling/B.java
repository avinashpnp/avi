package packExceptionHandling;

public class B {
	
	public void verify(int a, int b){
		System.out.println("Hello");
		try {
		System.out.println(a/b);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		B obj=new B();
		obj.verify(10, 0);
	}

}
