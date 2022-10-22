package Test1;

import java.util.HashMap;
import java.util.Map;

public class Test_Par {
	
	//input  int arry[] ={1,1,2,5,3,2,3,3,4}--> 3
	
	public static void main(String[] args) {
		
		int a1[]= {1,1,2,5,3,2,3,3,4};
		
		Map<Integer , Integer> m1 = new HashMap<Integer , Integer>();
		
		for(int i=0; i<=a1.length;i++) {
			
			if(!(a1.length==0)) {
				
				
				m1.put(a1[i], m1.get(a1));
				
			}else {
				
				
			}
			
			
		}

		
	}
	
	
}
