package packExceptionHandling;

public class A {
	
	
	public void printNumbers(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println("Print Numbers :"+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}/*finally {
				System.out.println("i am executing always");
			}*/
		}
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.printNumbers(10);
	}

}
