package com.destination.jdbcPrograms.day1;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.x.StatementExecuteOkMessageListener;
import com.mysql.cj.xdevapi.Statement;

public class Program5 {

	public static void main(String[] args)
	{
		try {
			Scanner sc = new Scanner(System.in);
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");

			String url = "jdbc:mysql://localhost:3306/test1";
			String user = "root";
			String pwd = "248030";

			Connection con = DriverManager.getConnection(url, user, pwd);
			String query = "select * from student_dtl";
			java.sql.Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()!=false)
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("---------------");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception caught");
			e.printStackTrace();
		}
			// TODO: handle exception
	}
}
*/

//package com.destination.jdbcPrograms.day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.x.StatementExecuteOkMessageListener;
import com.mysql.cj.xdevapi.Statement;

public class Program5 {

	public static void main(String[] args)
	{
		try {
			Scanner sc = new Scanner(System.in);
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");

			String url = "jdbc:mysql://localhost:3306/test1";
			String user = "root";
			String pwd = "248030";

			Connection con = DriverManager.getConnection(url, user, pwd);
			String query = "select * from student_dtl where id=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1,sc.nextInt());
			ResultSet rs = st.executeQuery();
			while(rs.next()!=false)
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("---------------");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception caught");
			e.printStackTrace();
		}
			// TODO: handle exception
	}
}
			

