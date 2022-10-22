package inque;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dul_Words {
	
	public static void main(String[] args) {
		
		findDuplicateWords("test1 java1 test");
		
	}
	
	public static void findDuplicateWords(String inputString) {
		
		
	String words[]	= inputString.split(" ");
	
	Map<String ,Integer> wordCount = new HashMap<String , Integer>();
	
	for(String word : words) {
		
		if(wordCount.containsKey(word)) {
			
			wordCount.put(word.toLowerCase()	, wordCount.get(word)+1);
			
		}else {
			
			wordCount.put(word.toLowerCase() , 1);
		}
		
		
	}
	
	Set<String> wordsInString = wordCount.keySet();
	
	for(String word : wordsInString) {
		
		if(wordCount.get(word)>1) {
			System.out.println(word + " : " + wordCount.get(word));
		}
	}
	
	//System.out.println(wordCount);
		
	}
	
	

}
