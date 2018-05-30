package packCollectionExample;

import java.util.*;

public class A {
	
	//List<String> list=new ArrayList<String>();
	List<String> list=new LinkedList<String>();
	public void m() {
		list.add("x");
		list.add("y");
		list.add("z");
	    list.add("x");
	    list.add(null);
		
		for(String names:list) {
			System.out.println(names);
		}
	}
	public static void main(String[] args) {
		A a=new A();
		a.m();
	}

}
