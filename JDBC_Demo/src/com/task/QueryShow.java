package com.task;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class QueryShow {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step1  load driver class
Class.forName("com.mysql.cj.jdbc.Driver");
		//step2 Establish the connection
Connection con=DriverManager.getConnection
("jdbc:mysql://@localhost:3306/task",
		"root","ramakrishna@9182");		
		//step3 create statement
 Statement st=con.createStatement();
		//step4 execute a statement
//st.execute("create table student(sid int,sname varchar(10))");
 //st.executeUpdate("insert into student values(101,'ajay')");
 //st.executeUpdate("update student set sname='ajayreddy' where sid=101");
 ResultSet rs=st.executeQuery("select *from emp1");
 while(rs.next())
 {
	 System.out.println(rs.getInt(1)+" "+rs.getString(2));
 }
		//step5 close connection
   con.close();
 
   
	}
}