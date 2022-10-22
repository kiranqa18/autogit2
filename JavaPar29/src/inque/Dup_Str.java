package inque;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dup_Str {
	
	public static void main(String[] args) {
		
		strCheck("KIRAN n");
		
		
		
		
//		String s = "RAVIA KIRAN";
//		
//		for(int i =0 ; i <s.length();i++) {
//			
//			for(int j=1 ; j<i ; j++) {
//				
//				if(s.charAt(i)==s.charAt(j)) {
//					
//					System.out.println(s.charAt(i));
//				}
//				
//				
//			}
//		}
	
	
	
	
	}
	
	public static void strCheck(String str) {
		
		if(str==null) {
			
			System.out.println("String is Null");
			return;
		}
		
		if(str.isEmpty()) {
			
			System.out.println("Empty String");
			return;
		}
		
		if(str.length()==1) {
			System.out.println("Single letter");
			return;
		}
		
		char words[] = str.toCharArray();
		
		Map<Character , Integer> charMap = new HashMap<Character , Integer>();
		
		for(Character ch : words) {
			
			if(charMap.containsKey(ch)){
				
				charMap.put(ch, charMap.get(ch)+1);
				
			}else {
				
				charMap.put(ch, 1);
				
			}
			
		}
		
	Set<Entry<Character,Integer>> entrySet =	charMap.entrySet();
		
	for(Map.Entry<Character, Integer> entry : entrySet) {
		
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
	}
	
	}

}
