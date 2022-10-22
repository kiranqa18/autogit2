package inque;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {
	
	public static void main(String[] args) {
		
		
		Integer a[]= {30,50,20,10,60};
		
//		System.out.println("Array elements before sorting :" + " " + Arrays.toString(a));
//		
//		Arrays.parallelSort(a);
//		
//		System.out.println("Array elements after sorting :" + " " + Arrays.toString(a));
		

		System.out.println("Array elements before sorting :" + " " + Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("Array elements after sorting :" + " " + Arrays.toString(a));
		
		
		
		
	}

}
