package com.employee.dao;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeDAO {
	public boolean insertEmployee(Employee employee);
	public void deleteEmployee(String empId);
	public List<Employee> selectAllEmployees();
	public Employee selectEmployee(String empId);
	
}
