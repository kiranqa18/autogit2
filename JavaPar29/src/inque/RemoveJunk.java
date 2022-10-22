package inque;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		
		String s = "$^%$^$#^$%&&)(*(_*)&% latin string 0123478596";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
		
		
		
	}

}
