package inque;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Max_Words {
	
	public static void main(String[] args) {
		
		Map<String , Integer> wordMap = new HashMap<String , Integer>();
		BufferedReader reader = null;
		
		String path = "C:\\JAVAPDF\\TESTDATA.TXT";
		
		try {
			reader = new BufferedReader(new FileReader(path));
			String currentLine = reader.readLine();
			
			while(currentLine != null) {
				
				String words[] = currentLine.toLowerCase().split(" ");
				
				for(String word : words) {
					if(wordMap.containsKey(word)) {
						wordMap.put(word, wordMap.get(word)+1);
					}else {
						wordMap.put(word,1);
					}
				}
				
				currentLine = reader.readLine();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		wordMap.forEach((k,v) -> System.out.println(k + ":" + v));
		
		Map<String , Integer> maxMap = new HashMap<String , Integer>();
		
		wordMap.entrySet().stream().filter(entry-> entry.getValue()== Collections.max(wordMap.values()))
		.forEach(e -> maxMap.put(e.getKey(), e.getValue()));
		
		System.out.println("--------------");
		System.out.println(maxMap);
		
		
	}

}
