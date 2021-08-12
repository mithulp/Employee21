package org.emp;

public class Employee {

	
	
	public Employee(String name) {
		this('a'); System.out.println("mithul : "+name);
	
	}
	public Employee(char block) {
	System.out.println("a"+block);
	}

	public Employee() {
		this("mk"); System.out.println("defaultconstructor");
	}
	
	private void empid() {
		System.out.println("emp name is : mithul");
	}
	
	private void empId() {
		System.out.println("emp name is : mithul");
	}
	
	
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empid();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
