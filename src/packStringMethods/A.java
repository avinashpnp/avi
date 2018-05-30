package packStringMethods;

public class A {
	
	public String city="Bangalore";
	public String str="Bangalore";
	public String str1="  Hello    xyz   ";
	public String name1="Bala";
	public String name2="BALA";
	public String x="Hello xyz";
	public void m1() {
		System.out.println(city.length());
		System.out.println(city.toLowerCase());
		System.out.println(city.toUpperCase());
		System.out.println(city.isEmpty());
		System.out.println(str.isEmpty()+"  "+str.length());
		System.out.println(city.charAt(4));
		System.out.println(city.trim());
		System.out.println(str1);
		System.out.println(str1.trim());
		System.out.println(city.concat(" hi"));
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.concat(name2));
		System.out.println("Bala"+"BALA");
		System.out.println(x);
		System.out.println(x.substring(6));
		System.out.println(x.substring(3));
		System.out.println(x.substring(3, 5));
		System.out.println(city);
		System.out.println(city.replace("a", "M"));
		System.out.println(city.contains(str));
		
		
	}
	public static void main(String[] args) {
		A obj=new A();
		obj.m1();
	}
	

}
