package javapar05;

import java.util.ArrayList;
import java.util.List;

public class EvenandOddNumbersInArray {


	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6};
		
		List<Integer> al = new ArrayList<>();
		

		for(int i=0 ; i<a.length;i++) {

			if(a[i] %2 ==0) {
				
				al.add(Integer.valueOf(a[i]));

				}
			
			

		}
		System.out.println(al);


		for(int i=0 ; i<a.length;i++) {

			if(a[i] %2 !=0) {

				System.out.println(a[i]);
			}

		}




	}

}
