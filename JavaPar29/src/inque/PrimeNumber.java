package inque;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		//System.out.println(isPrimeNumber(3));
		
		System.out.println(PrimeCount(4));
		
//		int num =1245;
//		
//		int count=0;
//		
//		if(num>1) {
//			
//			for(int i=1;i<=num;i++) {
//				
//				if(num%i==0)
//					count++;
//			}
//			
//			if(count==2) {
//				
//				System.out.println("Prime Number");
//			}
//			
//			else {
//				
//				System.out.println("Not the Prime");
//			}
//			
//		}
//		
//		else {
//			
//			System.out.println("TEST");
//		}
		
	}
	
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2 ; i<num;i++) {
			if(num%i ==0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static int PrimeCount(int num1) {
		
		int count =0 ;
		
		int ecount=0;
		
		if(num1<=1) {
			
			System.out.println("Prime count :" + count);
		}
		
		for(int i=2; i<=num1 ; i++) {
			
			if(num1%i==0) {
				
				ecount++;
				//System.out.println("");
				
			}else {
				
				count++;
				
			}
			
			
		}
		return count;
		
		
		
	}

}
