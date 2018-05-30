package packCollectionExample;

import java.util.*;

public class B {
	
Set<String> set=new HashSet<String>();
	public void m() {
		set.add("x");
		set.add("y");
		set.add("z");
	    set.add("x");
	    set.add(null);
		
		for(String names:set) {
			System.out.println(names);
		}
	}
	public static void main(String[] args) {
		B a=new B();
		a.m();
	}

}
