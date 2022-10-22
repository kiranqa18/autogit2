package mltpar;

public class Test_A {
	
	boolean flag = true;
	int itemCount = 0;
	
	public synchronized void produce() {
		
		try {
			
			while(true) {
				
				if(flag == true) {
					
					itemCount = itemCount+1;
					
					System.out.println("Prodcuer produced Item -" + itemCount);
					
					flag= false;
					
					notify();
					
					wait();
					
				}else {
					
					
					
					
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public synchronized void consume() {
		
		try {
			
			while(true) {
				
				if(flag== true) {
					
				}else {
					
				}
			}
			
		}catch(Exception e) {
			
		}
		
		
	}
	
	public synchronized void display() {
		
		for(int i = 0 ; i<10;i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
