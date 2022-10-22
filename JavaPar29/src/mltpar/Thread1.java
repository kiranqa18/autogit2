package mltpar;

public class Thread1 extends Thread {
	Test_A a;
	
	public Thread1(Test_A , a) {
		
		this.a = a;
	}
	
	public void run() {
		
		a.display();
	}
	
	

}


