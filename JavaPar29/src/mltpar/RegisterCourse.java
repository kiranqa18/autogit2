package mltpar;

public class RegisterCourse extends Thread {
	
	Object courseName;
	Object trainerName;
	
	RegisterCourse(Object courseName , Object trainerName){
		
		this.courseName = courseName;
		this.trainerName = trainerName;
	}
	
	public void run() {
		
		synchronized(courseName) {
			
			
		}
		
		
	}

}
