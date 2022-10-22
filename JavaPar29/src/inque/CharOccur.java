package inque;

import java.io.ObjectInputStream.GetField;

public class CharOccur {
	
	public static void main(String[] args) {
		
		getCharOccur("TEST", 'T');
		
		
	}
	
	
	public static void getCharOccur(String str , char val) {
		
		int count = 0;
		for(char ch : str.toCharArray()) {
			
			if(ch==val) {
				
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
