package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee employee);
	public void removeEmployee(String empId);
	public List<Employee> displayAllEmployees();
	public Employee findEmployee(String empId);	
}
