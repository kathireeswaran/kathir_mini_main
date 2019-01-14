package com.cg.ems.dao;

public interface QueryMapper {
	public static final String usercheck = "select username from User_master where username=? and password=?";
}
