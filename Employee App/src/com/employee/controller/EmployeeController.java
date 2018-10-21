package com.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String menu = request.getParameter("menu");

		if(menu.equals("add")) {
			EmployeeService es = new EmployeeServiceImpl();
			Employee employee = new Employee();
			employee.setEmpId(request.getParameter("empId"));
			employee.setEmpName(request.getParameter("empName"));
			employee.setEmpAddress(request.getParameter("empAddress"));

			boolean status = es.addEmployee(employee);
			List<Employee> employees =  es.displayAllEmployees();
			request.setAttribute("employees", employees);

			if(status) {
				RequestDispatcher rd = request.getRequestDispatcher("AddEmployee.jsp?msg=success");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("AddEmployee.jsp?msg=already_exists");
				rd.forward(request, response);
			}
		}
		else if(menu.equals("display")) {
			EmployeeService es = new EmployeeServiceImpl();
			List<Employee> employees =  es.displayAllEmployees();
			request.setAttribute("employees", employees);
			RequestDispatcher rd = request.getRequestDispatcher("DisplayAllEmployees.jsp");
			rd.forward(request, response);
		}
		else if(menu.equals("delete")) {
			String operation = request.getParameter("operation");
			EmployeeService es = new EmployeeServiceImpl();

			if(operation.equals("choose")) {
				List<Employee> employees =  es.displayAllEmployees();
				request.setAttribute("employees", employees);
				RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp");
				rd.forward(request, response);			
			}
			else if(operation.equals("delete")) {
				String empId = request.getParameter("empId");
				es.removeEmployee(empId);
				List<Employee> employees =  es.displayAllEmployees();
				request.setAttribute("employees", employees);
				RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp?msg=success");
				rd.forward(request, response);			

			}
		}
		else if(menu.equals("find")) {
			EmployeeService es = new EmployeeServiceImpl();
			String empId = request.getParameter("empId");
			System.out.println(empId);
			Employee employee = es.findEmployee(empId);
			if(employee==null) {
				RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp?msg=not_found");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("employee", employee);
				RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp");
				rd.forward(request, response);
			}

		}
	}


}
