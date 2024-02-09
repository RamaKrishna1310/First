package com.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		try {
			// step1 Load driver class

			Class.forName("com.mysql.cj.jdbc.Driver");
			// step2 Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root",
					"ramakrishna@9182");
			// step3 Create a Statement
			Statement stmt = con.createStatement();
			// step4 execute a statement
			stmt.executeUpdate("insert into emp1 values(10,'Rama', 50000)");
			// step5 close connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}