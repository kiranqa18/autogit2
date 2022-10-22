package inque;

import java.util.Random;

public class GenerateRandomNumbersandStrings {
	
	public static void main(String[] args) {
		
			Random rand = new Random();
			
			int rand_int = rand.nextInt(999999);
			
			System.out.println(rand_int);
			
		double	rand_db=rand.nextDouble();
		
		System.out.println(rand_db);
		
	     System.out.println(Math.random());
	
			
	}

}
