package packLoopsAndConditionalStatements;

public class C {
	
	/*for(exp1;exp2;exp3) {
		
	}*/
	
	/*<,>,==,<=,>=,=!,++,--*/
	
	public static void count(int num) {
		
		for(int i=1;i<=num;i++) {
			System.out.println(i);
			if(i==num) {
				System.out.println("loop completed");
			}
		}
		
	}
	
	public static void main(String[] args) {
		count(10);
	}

}
