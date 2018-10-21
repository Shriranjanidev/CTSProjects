package com.employee.db;

public class QueryConstants {
	public static String INSERT_QUERY = "insert into employee values(?,?,?)";
	public static String DELETE_QUERY = "delete from employee where empid=?";
	public static String SELECT_ALL_QUERY = "select empid,empname,empaddress from employee";
	public static String SELECT_BY_ID_QUERY = "select empid,empname,empaddress from employee where empid=?";
}
