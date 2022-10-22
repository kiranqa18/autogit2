package inque;

public class ConString {
	
	
	public static void main(String[] args) {
		
		
		String s = "JAVA PROGRAM IS USED IN SELENIUM";
		
		int l = s.length();
		
		
		String s1= s.replaceAll(" ", "");
		
		System.out.println(s1);
		
		int l1 = s1.length();
		
		System.out.println(l-l1);
	}

}
