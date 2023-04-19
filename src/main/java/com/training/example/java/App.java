package com.training.example.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		System.out.println("Hello World!");

		// Get DB Connection object from DBUtil class
		conn = DBUtil.getDatabaseConnection();

		// Prepared Statement
		// ? - position parameter , starts with 1
		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Student WHERE id = ?");
		pstmt.setInt(1, 1);

		ResultSet rs = pstmt.executeQuery();

		Student student1 = new Student();
		while (rs.next()) {
			student1.setFirstName(rs.getString(1));
			student1.setLastName(rs.getString(2));
			student1.setId(rs.getInt(3));
			student1.setCourse(rs.getString(4));

			System.out.println(student1);

		}

	}
}
