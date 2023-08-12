package com.lumen.inter;

public abstract class Employee implements IInsurance{
	String name;
    int empId;
    double salary;
	public Employee(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
void printDetails() {
	System.out.println("Name"+name);
	System.out.println("empId"+empId);
	System.out.println("salary"+salary);
}
 abstract String[] showCourses();

}
