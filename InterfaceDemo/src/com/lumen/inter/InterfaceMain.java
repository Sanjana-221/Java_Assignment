package com.lumen.inter;

public class InterfaceMain {
	public static void main(String[]args) {
		
	Employee employee= new Manager("Jhope",300,2000);
	employee.printDetails();
	employee.showCourses();
	IInsurance ins=employee;
	ins.HealthInusrance();
	ins.VehicleInsurance();
	IEntertainment entertainment=(Manager)employee;
	entertainment.showTrips();
	Manager manager=(Manager)employee;
	manager.calcBonus(1000);
	}
	

}
