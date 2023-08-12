package com.doctorapp.client;
import java.util.Arrays;
import java.util.List;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class Demo {
	public static void main(String[] args) {
		
		IDoctorService doctorService=new DoctorServiceImpl();
		
		List<Doctor>doctor1=Arrays.asList(new Doctor("Sanjana","pediatrician",304.0,5),
				new Doctor("Shalini","cardiologist",505.8,10),new Doctor("Varshitha","urology",308.7,10),new Doctor("Jayan","optometry",405.8,10));



		List <Doctor>doctors=doctorService.getAllDoctors();
	    System.out.println("All Doctors");
	    doctors.forEach(System.out::println);
		
	    
	    doctors=doctorService.getBySpeciality("pediatrician");
	    System.out.println("Doctors by speciality");
	    doctors.forEach(System.out::println);
	    
	    doctors=doctorService.getBySpecialityAndFees("urology",7);
	    System.out.println("Doctors by speciality and exp");
	    doctors.forEach(System.out::println);
	    
	    doctorService.updateDoctor(22, 405.08);
	    doctors=doctorService.getBySpecialityAndFees("cardiology",505.8);
	    System.out.println("Doctors by speciality and fees");
	    doctors.forEach(System.out::println);
		
}
}





	


