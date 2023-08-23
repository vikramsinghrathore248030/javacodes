package com.destination.jdbcPrograms.day1;


	//package com.destination.jdbcPrograms.day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class Program7 
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
			String sql = "Delete from student_dtl where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			//System.out.println("Enter the name to be changed:");
			//pst.setString(1, sc.next());
			System.out.println("Enter the id:");
			pst.setInt(1,sc.nextInt());
			int x = pst.executeUpdate();
			if(x>0)
			{
				System.out.println("Deleted");
			}
			else
			{
				System.out.println("not Deleted");
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
