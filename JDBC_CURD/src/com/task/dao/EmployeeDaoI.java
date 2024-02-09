package com.task.dao;

import java.sql.SQLException;

import com.task.bean.Employee;

public interface EmployeeDaoI {

	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException ;
}
