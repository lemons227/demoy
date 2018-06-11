package cn.test.utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

//连接数据库
public class JdbcUtils {

	public static void main(String[] args) {
		System.out.println(JdbcUtils.getConnection());
		System.out.println(JdbcUtils.getConnection());
		System.out.println(JdbcUtils.getConnection());
	}
	static {
		System.out.println("@@@@@@@@@@@@@");
//		DriverManager.getConnection(url)
//		com.mysql.jdbc.Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("链接出错");
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	public static Connection getConnection() {
	try {
		return	DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw new RuntimeException(e);
	}
	}
	
	

}
