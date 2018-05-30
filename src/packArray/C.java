package packArray;

public class C {

	String x;
	// String[] cities=new String[3];//declaration
	// String[][] cities=new String[3][2];
	String[] cities = { "Bng", "Chn", "Hyd" };
	String[][] names = { { "xyz", "abc" }, { "mno", "pqr" } };

	public void m() {
		// System.out.println(x.length());
		for (String s : cities) {
			System.out.println(s);
		}
		// System.out.println(cities[3]);
		System.out.println();
		System.out.println(cities[2]);
	}

	// 2d array
	public void mm() {
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 2; col++) {
				System.out.println(names[row][col]);
			}
		}
		System.out.println();
		System.out.println(names[1][1]);
	}

	public static void main(String[] args) {
		C obj = new C();
		//obj.m();
		obj.mm();
	}

}
