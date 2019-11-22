package com.db.connect;

import java.sql.*;

public class MYSQLConnect {
	public Connection getcon() {
	    Connection con = null;
		try {
		String username = "root";
		String password = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tb2",username,password);
		System.out.println("Db Connected..");
		}catch(Exception e) {
			System.out.println("Failed to Connect DB..!!!");
		}
		return con;
	}
public static void main(String[] args) {
	MYSQLConnect mssql = new MYSQLConnect();
	mssql.getcon();
}
}
