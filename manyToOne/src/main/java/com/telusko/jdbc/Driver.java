package com.telusko.jdbc;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "welcome123");
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery("select * from CUSTOMER");
			while(res.next()) {
				System.out.println(res.getString("CustName"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
