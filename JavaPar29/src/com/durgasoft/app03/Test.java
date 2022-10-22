package com.durgasoft.app03;


class Employee{
	
}

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c1 = Class.forName("com.durgasoft.app03.Employee");
		
		System.out.println(c1.getName());
		
		Employee emp = new Employee();
						
		Class c2 = emp.getClass();
		
		System.out.println(c2.getSimpleName());
		
		Class c3 = Employee.class;
		System.out.println(c3.getSimpleName());
		
	}

}
