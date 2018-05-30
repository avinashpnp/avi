package packPolymorphism;

public class B extends A{

	public void add(int a, double b) {
		System.out.println(a+b);
	}
	
	public void nokiaDesign() {
		System.out.println("Nokia4 design");
	}
	public static void main(String[] args) {
		A obj=new A();
		obj.add(1, 2);
		obj.add(11, 21);
		obj.add(11, 22, 33);
		obj.nokiaDesign();
	   B b=new B();
		b.nokiaDesign();
		b.add(20,1.5);  
		
	}
}
    