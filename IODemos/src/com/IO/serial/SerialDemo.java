package com.IO.serial;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
	public static void main(String[]args) {
		Student student = new Student();
		Student.setStudentName("whiskey");
		student.setStudentId(21);
		student.setDepartment("CSE");
		//Serialize 
		try(FileOutputStream fileOutputStream = new FileOutputStream("stud.ser");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream) {
					ObjectOutputStream.writeObject(student);
					
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
	}

}
