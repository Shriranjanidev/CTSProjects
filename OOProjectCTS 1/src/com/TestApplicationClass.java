package com;

import java.util.Scanner;

public class TestApplicationClass {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			Student student = new  Student(name,age);
			student.registerStudent();
			student.registerForExam();
			student.appearForExam();
			
			System.out.println("ADMISSION ID: "+student.getAdmissionid());
			System.out.println("RESULT: "+student.getResult());
			
		}  catch(Exception e) {
			System.out.println("Failed due to "+e);
		}
	}

}
