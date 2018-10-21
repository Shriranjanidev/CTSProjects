package com.employee.service;

import java.util.List;

import com.employee.dao.EmployeeDAO;
import com.employee.dao.EmployeeDAOImpl;
import com.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDAO ed;
	@Override
	public boolean addEmployee(Employee employee) {
		ed = new EmployeeDAOImpl();
		return ed.insertEmployee(employee);
	}

	@Override
	public void removeEmployee(String empId) {
		ed = new EmployeeDAOImpl();
		ed.deleteEmployee(empId);
	}

	@Override
	public List<Employee> displayAllEmployees() {
		ed = new EmployeeDAOImpl();
		return ed.selectAllEmployees();
	}

	@Override
	public Employee findEmployee(String empId) {
		ed = new EmployeeDAOImpl();
		return ed.selectEmployee(empId);
	}

}
