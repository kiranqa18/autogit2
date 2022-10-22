package javapar05;

import java.util.Arrays;

public class ArrayEqual {
	
	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5,6};
		
		int a2[]= {1,2,3,4,5,6};
		
		boolean status = Arrays.equals(a1, a2);
		
		System.out.println(status);
		
		
		if(a1.length == a2.length) {
			
			for(int i=0;i<a1.length;i++) {
				
				if(a1[i] != a2[i]) {
					
					status = false;
				}
				
			}
		}
		
		else {
			
			status = false;
			
		}
		
	}

}
