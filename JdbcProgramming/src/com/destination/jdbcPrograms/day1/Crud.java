package com.destination.jdbcPrograms.day1;

import java.sql.*;
import java.util.Scanner;

public class Crud
{
	public static void main(String[] args) throws Exception 
	{
		String url = "jdbc:mysql://localhost:3306/jdbccodes";
		String user = "root";
		String pwd = "248030";
		Connection connection = DriverManager.getConnection(url, user, pwd);
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);

		while (!exit) {
			System.out.println("Choose an operation:");
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				create(connection, scanner);
				break;
			case 2:
				read(connection);
				break;
			case 3:
				update(connection, scanner);
				break;
			case 4:
				delete(connection, scanner);
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice. Please select again.");
			}
		}
	}

	public static void create(Connection connection, Scanner scanner) throws Exception 
	{
		System.out.println("Enter value for Name:");
		String value1 = scanner.next();

		System.out.println("Enter value for Age:");
		String value2 = scanner.next();

		String insertQuery = "INSERT INTO crudop (Name, Age) VALUES (?, ?)";

		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, value1);
		preparedStatement.setString(2, value2);

		int rows = preparedStatement.executeUpdate();
		System.out.println(rows + " row(s) inserted.");
	}


	private static void read(Connection connection) throws Exception 
	{
		String selectQuery = "SELECT * FROM crudop";

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(selectQuery);

		while (resultSet.next()) 
		{
			String column1Value = resultSet.getString("Name");
			String column2Value = resultSet.getString("Age");
			System.out.println("Name: " + column1Value + ", Age: " + column2Value);
		}
	}


	private static void update(Connection connection, Scanner scanner) throws Exception 
	{
		System.out.println("Enter new value for Name:");
		String newValue = scanner.next();

		System.out.println("Enter condition for update ");
		String condition = scanner.next();

		String updateQuery = "UPDATE crudop SET Name = ? WHERE " + condition;

		PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
		preparedStatement.setString(1, newValue);

		int rows = preparedStatement.executeUpdate();
		System.out.println(rows + " row(s) updated.");
	}


	private static void delete(Connection connection, Scanner scanner) throws Exception 
	{
		System.out.println("Enter condition for delete ");
		String condition = scanner.next();

		String deleteQuery = "DELETE FROM crudop WHERE " + condition;

		Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(deleteQuery);
		System.out.println(rows + " row(s) deleted.");
	}
}
