package inque;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num = 151;
		
		int rev=0;
		
		int t=num;
		
		while(num>0) {
			
			//r=num%10;
			
			rev =rev*10+num%10; 
			
			num=num/10;
		}
		
	System.out.println(num);
		//System.out.println(rev);
		
		if(t==rev) {
			
			System.out.println("Number is palidrome");
			
		}else {
			System.out.println("Number is not palidrome");
		}
		
	}

}
