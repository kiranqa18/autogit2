package inque;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dup_Array_Elements {
	
	
	public static void main(String[] args) {
		
		String str = "The rains have started here";
		
		String str1 = "The rains have started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf("s" , 9));
		
	    System.out.println(str.indexOf("have"));
	    
	   System.out.println(str.equalsIgnoreCase(str1));
	    
	   System.out.println(str.substring(0, 9));
	   
	   
	   String test = "Hello_World_test_Selenium";
	   
	   String testval[] = test.split("_");
	   
	   System.out.println(Arrays.toString(testval)	);
	}

}
