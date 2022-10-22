package inque;

public class Null_Check {
	
	public static void main(String[] args) {
		
		test(1234);
		
		//StaticBlock_Par s12 = new StaticBlock_Par();
		int x=StaticBlock_Par.createObject();
		
		System.out.println(x);
		
	}
	
	
	public static void test(Object o) {
		System.out.println("Object Arrgement");
	}

	public static void test(String s) {
		
		System.out.println("String Argument");
		
//		public static void test(StringBuffer sb1) {
//			
//			
//		}
	}
	
}
