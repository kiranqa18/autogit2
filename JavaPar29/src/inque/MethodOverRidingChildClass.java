package inque;

public class MethodOverRidingChildClass extends MethodoverridingParentClass {

	public void myMethod() {
		System.out.println("I am method from child class");
	}
	
	
	public static void main(String[] args) {
		//MethodOverridingParentClass obj = new MethodOverridingChildClass();
		
		
		 MethodOverRidingChildClass obj = new MethodOverRidingChildClass();
		 
		 obj.myMethod();
		 
		 
		
	}
}
