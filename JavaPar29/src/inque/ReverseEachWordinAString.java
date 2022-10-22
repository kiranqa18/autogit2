package inque;

import java.util.Arrays;

public class ReverseEachWordinAString {
	
	public static void main(String[] args) {
		
		String str = "Welcome to Java";
		
		String words[] = str.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		
		String reverseString = " ";
		
		for(String w:words) {
			String reverseword = "";
			
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseword=reverseword+w.charAt(i);
			}
			
			reverseString = reverseString+reverseword+" ";
			
			
			
		}
		
		System.out.println(reverseString);
		
	}

}
