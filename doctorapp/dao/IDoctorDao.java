package com.doctorapp.dao;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorDao {
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId,double fees);
	Doctor findById(int doctorId);
	void deleteDoctor(int doctotId);
	List<Doctor>findAllDoctors();
	List<Doctor>findBySpeciality(String speciality) throws DoctorNotFoundException;
	List<Doctor>findBySpecialityAndExp(String speciality,int experience) throws DoctorNotFoundException;
	List<Doctor>findBySpecialityAndFees(String speciality,double fees) throws DoctorNotFoundException;
}
	


