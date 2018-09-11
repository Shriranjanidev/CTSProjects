package com;

public class TestApplicationClass {

	public static void main(String[] args) {
		Student student = new  Student("Jammy");
		student.registerStudent();
		student.registerForExam();
		student.appearForExam();
		System.out.println("ADMISSION ID: "+student.admissionid);
		System.out.println("RESULT: "+student.result);
	}

}
