package mltpar;

public class Test {

	public static void main(String[] args) {
		
//		Mul_Trd3 mt1 = new Mul_Trd3();
//		
//		Mul_Trd3 mt2 = new Mul_Trd3();
//		
//		Mul_Trd3 mt3 = new Mul_Trd3();
//		
//		mt1.setName("AAA");
//		
//		mt2.setName("BBB");
//		
//		mt3.setName("CCC");
//		
//		mt1.start();
//		
//		mt2.start();
//		
//		mt3.start();
//		
		
		Test_A a = new Test_A();
		
		Thread1 t1 = new Thread1(a);
		
		Thread2 t2 = new Thread2(a);
		
		t1.start();
		
		t2.start();
		
		}
}
