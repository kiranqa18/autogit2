package inque;

public class StringToInteger {
	
	public static void main(String[] args) {
		
//		String s = "123";
//		
//		int i = Integer.parseInt(s);
//		
//		System.out.println(i+10);
		
		stringToNumber("143");
		
	}
	
	public static void stringToNumber(String str) {
		
		int num = 0;
		int len = str.length();
		for(int i=0 ; i<len ; i++) {
	    num = num*10+((int)str.charAt(i)-48);
		
		}
		
		//return num ;
		
		System.out.println(num);
		
		
		
	}
	



}

