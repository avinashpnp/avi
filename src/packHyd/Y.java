package packHyd;


import packBng.AAA;
import packBng.X;

public class Y extends X {

	public void multiplication() {
		System.out.println(11*444);
	}
	
	public static void main(String[] args) {
		Y y=new Y();
		y.addition();
		y.multiplication();
		y.subtraction();
		
		AAA aa=new AAA();
		aa.division();
	}
}
