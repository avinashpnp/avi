package packArray;

public class A {
	
	//datatype[] obj=new datatype[size];
	int[] i=new int[5];//declaration
	int[][] j=new int[3][2];
	public void m() {
		System.out.println(i[4]);
		//System.out.println(i[5]);
		System.out.println(j[2][1]);
		System.out.println(j[3][0]);
	}
	public static void main(String[] args) {
		A obj=new A();
		obj.m();
	}

}
