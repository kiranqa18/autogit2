package inque;

public class StringSwap {
public static void main(String[] args) {
	
	String a= "Hello";
	
	String b = "World";
	
	
	a=a+b;
	
	System.out.println(a);
	
	b= a.substring(0, a.length()-b.length());
	
	System.out.println(b);
	
	a=a.substring(b.length());
	
	System.out.println(a);
	
	
}
}
