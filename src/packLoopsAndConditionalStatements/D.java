package packLoopsAndConditionalStatements;

public class D { 
	
	/*while(cond) {
		
	}*/ //multi  line comment ctrl+shift+/ for un comment ctrl+shift+\
	
	/*do {
		
	}while(cond);*/
	
	public static void simplify(int x) {
		while(x>10) {
			System.out.println("Hello");
		}
		
		/*do {
			System.out.println("Hi Avinash..");
		}while(x>100);*/
	}

	public static void main(String[] args) {
		simplify(11);
	}
}
