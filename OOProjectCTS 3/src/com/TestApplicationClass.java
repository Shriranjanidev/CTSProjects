package com;

import java.util.Scanner;

import university.Math;
import university.Science;
import university.Student;
import university.Subject;

public class TestApplicationClass {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {

			System.out.println("Enter student name: ");
			String name = sc.nextLine();

			System.out.println("Enter student age: ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter specialization\n1.Mathematics\n2.Science\nEnter your choice:");
			int subjectChoice = sc.nextInt();

			Subject subject = new Subject();
			if(subjectChoice==1) 
				subject = new Math();
			else if(subjectChoice==2) 
				subject = new Science();

			Student student = new Student(name, age, subject);
			student.registerStudent();
			student.registerForExam();
			student.appearForExam();

			System.out.println("ADMISSION ID: "+student.getAdmissionid());
			System.out.println("RESULT: "+student.getResult());
			System.out.println("SPECIALIZATION : "+student.getSubject().getSubjectName());
		} catch(Exception e) {
			System.out.println("Failed due to "+e);			
		}
	}

}
