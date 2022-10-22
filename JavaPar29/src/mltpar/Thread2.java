package mltpar;

public class Thread2 extends Thread{

	Test_A a;
	
	Thread2(Test_A a){
		
		this.a=a;
	}
	
	public void run() {
		
		a.increment();
	}
	
}
