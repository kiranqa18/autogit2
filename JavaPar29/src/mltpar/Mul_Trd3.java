package mltpar;

public class Mul_Trd3 extends Thread {

	
	public void run() {
		for(int i=0;i<10 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
