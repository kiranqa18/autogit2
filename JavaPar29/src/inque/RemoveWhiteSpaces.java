package inque;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String str = "Java Programming selenium automation";
		
		String str1 = str.replaceAll("\\s", "");
		
		System.out.println(str1);
		
	}

}
