package mltpar;

public class mulpar extends WelcomeThread {
	
	public static void main(String[] args) {
		
		WelcomeThread welcomeThread = new WelcomeThread();
		
		welcomeThread.start();
		
		System.out.println("completed");
	}

}
