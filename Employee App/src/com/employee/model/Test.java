package com.employee.model;

import java.util.List;
import java.util.Scanner;

import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;

public class Test {
	public static void main(String[] args) {
		EmployeeService es = new EmployeeServiceImpl();
		
		List<Employee> employees = es.displayAllEmployees();
		System.out.println("| Employee id | Employee Name | Address |");
		System.out.println("----------------------------------");
		for (Employee e : employees) {
			System.out.print("|"+e.getEmpId()+"|");
			System.out.print(e.getEmpName()+"|");
			System.out.print(e.getEmpAddress()+"|");
			System.out.println();
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String empId = sc.nextLine();
		Employee employee = es.findEmployee(empId);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAddress());
		sc.close();
	}
}
