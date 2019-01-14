package com.cg.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;
import com.cg.ems.utility.JdbcUtility;

public class EmployeeDaoImpl implements EmployeeDAO {
	PreparedStatement statement = null;
	Connection connection = null;

	@Override
	public boolean validateFields(String username, String password) throws EMSException {
		List<Employee> list = new ArrayList<>();
		ResultSet resultSet = null;
		connection = JdbcUtility.getConnection();
		boolean flag = false;
		try {
			statement = connection.prepareStatement(QueryMapper.usercheck);
			statement.setString(1, username);
			statement.setString(2, password);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				String user = resultSet.getString("username");
				Employee emp = new Employee();
				emp.setUserName(user);
				list.add(emp);
			}
			for (Employee employee : list) {
				System.out.println(employee.getUserName());
			}
			if (list.isEmpty()) {
				flag = false;
			} else {
				flag = true;
			}
		} catch (SQLException e) {
			throw new EMSException("no data found for sql fault");
		}
		return flag;
	}

}
