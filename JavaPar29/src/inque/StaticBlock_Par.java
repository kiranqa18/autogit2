package inque;

public class StaticBlock_Par {
	
	int age;
	
	static {
		
		StaticBlock_Par obj1 = new StaticBlock_Par();
		
		System.out.println("Staic Block");
	}
	
	public static int createObject() {
		
		StaticBlock_Par obj1 = new StaticBlock_Par();
		obj1.age = 40;
		return obj1.age;
		
	}
	
	private StaticBlock_Par(){
		age=30;
	}
	
	public static void main(String[] args) {
		
		StaticBlock_Par a1 = new StaticBlock_Par();
	}

}
