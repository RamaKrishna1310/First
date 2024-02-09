import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import  com.task.util.*;
import com.task.bean.Employee;
package com.task.dao;
public class EmployeeDaoImp implements EmployeeDaoI{

	public static Connection connection=null;
	public static PreparedStatement pst=null;
	
	@Override
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException{
		String empname = emp.getEmpName();
		String empaddress = emp.getEmpAddress();
		connection = EmployeeUtil.getDBConnection();
		pst  = connection.prepareStatement("insert into employee values(?,?)");
		pst.setString(1, "Rama");
		pst.setString(2, "Krishna");
		pst.executeUpdate();
		System.out.println("One Record is Inserted");
	}
}
