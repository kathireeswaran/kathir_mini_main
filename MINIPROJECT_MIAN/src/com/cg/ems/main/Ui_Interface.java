package com.cg.ems.main;

import java.util.Scanner;

import com.cg.ems.exception.EMSException;

import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class Ui_Interface {

	public static void main(String[] args) throws EMSException {
		Scanner scanner = new Scanner(System.in);
		boolean result = false;
		do {
			System.out.println("enter username");
			String username = scanner.nextLine();
			System.out.println("enter password");
			String password = scanner.nextLine();

			EmployeeService service = new EmployeeServiceImpl();
			try {
				boolean result1 = service.validateFields(username, password);

				if (result1 == true) {
					System.out.println("******EMPLOYEMENT MANAGEMENT ADMIN CONSOLE**********");
					System.out.println();
					
				} else {
					System.out.println("username /password wrong");
				}
			} catch (EMSException e) {
				throw new EMSException("services doesnt established");
			}
		} while (result == true);
	}

}
