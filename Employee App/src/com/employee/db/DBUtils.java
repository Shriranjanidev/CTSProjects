package com.employee.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

	public static Connection con;
	public static Connection getConnection() {
		try {
			if(con==null) {
				/*File file = new File("properties/db.properties");
				System.out.println(Thread.currentThread().getContextClassLoader().getClass());
				InputStream is = DBUtils.class.getClassLoader().getResourceAsStream("properties/db.properties"); 
				Properties prop = new Properties();
				prop.load(is);
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");*/
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
				System.out.println("--------Connection Established----");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
