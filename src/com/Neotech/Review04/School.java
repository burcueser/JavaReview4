package com.Neotech.Review04;

public class School {

	public static void main(String[] args) {
		// Create a class School with a main method
		// Create 2 objects/instances of Student Class
		// Create 1 object of Teacher class yellAtStudent

		Student student = new Student();
		Student student2 = new Student();
		Teacher teacher = new Teacher();

		student.name = "Burcu";
		student.studentNr = 1;
		student.gradeLevel = 6;

		student2.name = "Onur";
		student2.studentNr = 2;
		student2.gradeLevel = 7;

		teacher.teacherName = "Elion";
		teacher.subject = "Java";
		teacher.salary = 150000;

		student.sleep();
		student.study();
		teacher.teach();
		teacher.yellAtStudent(student2.name); // we wanted him to yell at specific student

	}

}
