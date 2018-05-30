package packCollectionExample;

import java.util.*;

public class C {
	
	Map<Integer,String> m=new HashMap<Integer,String>();
	//Map<Integer,String> m=new LinkedHashMap<Integer,String>();
	public void m() {
		m.put(101, "xyz");
		m.put(102, "abc");
		m.put(103, "pqr");
		m.put(104, "xyz");
		m.put(102, "yyy");
		m.put(null, null);
		
		for(Map.Entry collection:m.entrySet()) {
			System.out.println(collection.getKey()+"  "+collection.getValue());
		}
	}

	public static void main(String[] args) {
		C obj=new C();
		obj.m();
	}
}
