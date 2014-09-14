package com.nikias.samplefitnesse.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TestDb {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("org.hsqldb.jdbc.JDBCDriver");
	Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb?user=test&password=test");
	System.out.println(connection);
}
}
