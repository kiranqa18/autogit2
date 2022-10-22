package Java8_Par;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Hash_Par  {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		
		t.add(5);
		
		t.add(10);
		
		t.add(15);
		
		t.add(2);
		
		System.out.println(t);
		
	}

	
}
