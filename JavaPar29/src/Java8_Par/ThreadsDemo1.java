package Java8_Par;

public class ThreadsDemo1 {
	
	public static void main(String[] args) {
		
		Runnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		
		t.start();
		
		for(int i=1 ; i<=10;i++) {
			
			System.out.println("Main Thred");
			
		}
		
		
		
	}

}
