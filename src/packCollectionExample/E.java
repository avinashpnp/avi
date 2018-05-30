package packCollectionExample;

public class E extends D {
	
	public void mm() {
		//D obj=new D();
		//System.out.println(obj.x);
		System.out.println(getX());
	}
	
	public static void main(String[] args) {
		E o=new E();
		o.mm();
	}

}
