package Ecom_Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static String Driver = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/ecom_project";
	private static String User ="root";
	private static String Password ="L@lit9137";
	
	private static Connection con = null;
	
	public static Connection createCon() {
		
		try {
			// Register Driver
			Class.forName(Driver);
			// Connection established
			con = DriverManager.getConnection(URL,User,Password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	private DBConnection() {
		
	}
	
}
