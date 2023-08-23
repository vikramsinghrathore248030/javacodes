/**
 * 
 */
package com.destination.jdbcPrograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * To check connectivity to the database
 */
public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		String url = "jdbc:mysql://localhost:3306/jdbcCodes";
		String user = "root";
		String pwd = "248030";
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		if(con!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection failed");
		}
	}

}
