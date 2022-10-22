package inque;

public class AAA {
	
	AAA(){
		
		System.out.println("Object Creating...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroying...");
	}

}
