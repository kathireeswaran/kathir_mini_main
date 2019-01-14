package com.cg.ems.dao;

import com.cg.ems.exception.EMSException;

public interface EmployeeDAO {

	boolean validateFields(String username, String password) throws EMSException;

}
