package inque;

import java.util.HashMap;
import java.util.Map;

public class Leet_Par {
	
	public static void main(String[] args) {
		
		lengthOfLongestSubstring("pwwkew");
		
	}
	
	
	public static  int lengthOfLongestSubstring(String s) {
		
		
		//String s = "pwwkew";
		
		
		 Map<Character,Integer> m1 = new HashMap();
		 
		 int max=0;
		 
		 char[] ch1 = s.toCharArray();
		 
		 for(int i=0;i<ch1.length;i++) {
			 
			 char ch = ch1[i];
			 if(!m1.containsKey(ch)) {
				 
				 m1.put(ch, i);
			 }else {
				 i=m1.get(ch);
				 m1.clear();
			 }
			 
			 if(m1.size()>max) {
				 
				 max=m1.size();
			 }
			 return max;
			 
		 }
		//return max;
		return max;
		 
	}
		
		
	}


