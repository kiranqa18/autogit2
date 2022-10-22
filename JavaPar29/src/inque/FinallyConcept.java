package inque;

public class FinallyConcept {
	
	public static void main(String[] args) {
		
		//test1();
		
		expTest();
		
	}
	
	public static void test1() {
		
		
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
			
			
		}catch(Exception e) {
			System.out.println("Inside catch block");
		}
		
		finally {
			System.out.println("Inside finally block");
		}
		
		
		
	}
	
	public static void expTest() {
		
		int i=10;
		
		try {
			
			System.out.println("Inside Try1");
						int k=i/0.5;
						
		}catch(ArithmeticException e) {
			System.out.println("Inside Arthimetic exception");
			
		}
		catch(Exception e) {
			
			System.out.println("Inside main exception e");
		}
		
		
		
	}

}
