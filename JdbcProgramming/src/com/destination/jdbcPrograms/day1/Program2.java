package com.destination.jdbcPrograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");

			String url = "jdbc:mysql://localhost:3306/jdbcCodes";
			String user = "root";
			String pwd = "248030";

			Connection con = DriverManager.getConnection(url, user, pwd);
			if(con!=null) {
				System.out.println("Connection established");
				Statement stmt = con.createStatement();
				System.out.println("Enter the database name:");
				int x = stmt.executeUpdate("create database "+sc.next());
				if(x>0) {
					System.out.println("Database created");
				}
				else {
					System.out.println("Database creation failed");
				}
				stmt.close();
				con.close();
			}
			else {
				System.out.println("Connection failed");
			}
			
		}
		catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
}







