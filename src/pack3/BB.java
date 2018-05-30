package pack3;

public class BB extends AA{
	//here AA is parent and BB is child
	
	public void multiplication() {
		System.out.println(11*444);
	}
	
	public static void main(String[] args) {
		BB b=new BB();
		b.addition();
		b.multiplication();
	}

}
