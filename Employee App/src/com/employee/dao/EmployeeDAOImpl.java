package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.employee.db.DBUtils;
import com.employee.db.QueryConstants;
import com.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public boolean insertEmployee(Employee employee) {
		boolean status = false;
		try {
			if(employee.getEmpId().equals(selectEmployee(employee.getEmpId()).getEmpId())) {
				status = false;
			}
			else {
			con = DBUtils.getConnection();
			ps = con.prepareStatement(QueryConstants.INSERT_QUERY);
			ps.setString(1, employee.getEmpId());
			ps.setString(2, employee.getEmpName());
			ps.setString(3, employee.getEmpAddress());
			int added = ps.executeUpdate();
			if(added>0)
				status=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public void deleteEmployee(String empId) {
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement(QueryConstants.DELETE_QUERY);
			ps.setString(1,empId);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> selectAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement(QueryConstants.SELECT_ALL_QUERY);
			rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getString(1));
				employee.setEmpName(rs.getString(2));
				employee.setEmpAddress(rs.getString(3));
				employees.add(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee selectEmployee(String empId) {
		Employee employee = null;
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement(QueryConstants.SELECT_BY_ID_QUERY);
			ps.setString(1, empId);
			rs = ps.executeQuery();
			if(rs.next()) {
				employee = new Employee();
				employee.setEmpId(rs.getString(1));
				employee.setEmpName(rs.getString(2));
				employee.setEmpAddress(rs.getString(3));	
			}
		} catch (Exception e) {
			System.out.println("Someeeeee");
			e.printStackTrace();
		}
		return employee;
	}

}
