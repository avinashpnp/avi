package packArray;

public class B {
	int[] a= {1,2,33,12};//initialization array
	int[][] b= {{11,22},{33,44}};
	
	//1d array
	public void m() {
		//foreach syntax:
		//for(datatype obj:collection or array){}
		/*for(int ii:a) {
			System.out.println(ii);
		}*/
		/*for(int row=0;row<4;row++) {
			System.out.println(a[row]);
		}*/
		for(int row=0;row<=a.length;row++) {
			System.out.println(a[row]);
		}
	}
	//2d array
	public void mm() {
		for(int row=0;row<2;row++) {
			for(int col=0;col<2;col++) {
				System.out.print(b[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		B bb=new B();
		//bb.m();
		bb.mm();
	}

}
