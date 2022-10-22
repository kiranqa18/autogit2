package inque;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapPar {
	
	public static void main(String[] args) {
		
		HashMap<String , Integer> stds = new HashMap<String , Integer>();
		
		stds.put("Nag", 89);
		stds.put("Durge", 97);
		stds.put("Ramesh", 97);
		
		
		System.out.println(stds);
		
		LinkedHashMap<String , Integer> students =new  LinkedHashMap<String , Integer>();
		
		students.put("Ravi" , 101);
		students.put("kiran" , 102);
		
		System.out.println(students);
		
		
	}

}
