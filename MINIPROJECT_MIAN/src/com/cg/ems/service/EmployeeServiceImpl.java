package com.cg.ems.service;

import com.cg.ems.dao.EmployeeDAO;
import com.cg.ems.dao.EmployeeDaoImpl;
import com.cg.ems.exception.EMSException;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO employeeDao = new EmployeeDaoImpl();

	@Override
	public boolean validateFields(String username, String password) throws EMSException {
		return employeeDao.validateFields(username, password);
	}

}
