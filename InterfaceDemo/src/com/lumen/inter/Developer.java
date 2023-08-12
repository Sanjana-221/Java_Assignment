package com.lumen.inter;

public class Developer extends Employee implements IEntertainment, IGamer {

	public Developer(String name, int empId, double salary) {
		super(name, empId, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void VehicleInsurance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void HealthInusrance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void indoor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void outdoor() {

	}

	@Override
	public void showTrips() {
		// TODO Auto-generated method stub

	}

	@Override
	String[] showCourses() {
		return null;
	}

}
