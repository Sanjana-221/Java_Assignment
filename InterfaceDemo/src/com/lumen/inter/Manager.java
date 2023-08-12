package com.lumen.inter;

public class Manager extends Employee implements IEntertainment {

	public Manager(String name, int empId, double salary) {
		super(name, empId, salary);
	}

	@Override
	public void VehicleInsurance() {
 System.out.println("The vehicle insurance is 10%");
	}

	@Override
	public void HealthInusrance() {
System.out.println("The health insurance is about 20%");
	}

	@Override
	public void showTrips() {
System.out.println("hill ststaion chikmagaluru");
	}

	@Override
	String[] showCourses() {
		return null;
	}
void calcBonus(int amount) {
	//bonus=salary-amount;
}
}
