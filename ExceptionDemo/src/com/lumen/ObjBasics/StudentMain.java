package com.lumen.ObjBasics;

public class StudentMain {
public static void main(String[] args) {
		
		
		Student student=new Student("NoahSA","ISE");
        
		student.printDetails();
       
		
		student.getGrades(88,90,93);
		

		Student student1 = new Student("Sanjana", "CSE");
		
		student1.printDetails();
		
		student1.getGrades(92,80,97);

}
}


