package com.cg.ems.service;

import com.cg.ems.exception.EMSException;

public interface EmployeeService {

	boolean validateFields(String username, String password) throws EMSException;

}
