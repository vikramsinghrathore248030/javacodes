package com.destination.jdbcPrograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Program8 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test1";
			String user = "root";
			String pwd = "248030";
			Connection con = DriverManager.getConnection(url,user,pwd);
			
			String sql = "Select * from student_dtl";
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			rs.afterLast();
			while(rs.previous()==true)
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}
		catch (Exception e) 
		{
			System.out.println("excpetion handled");
			e.printStackTrace();
			// TODO: handle exception
		}


	}

}
