package utils;

import java.sql.*;

public class DBConnection {
	private static String url="jdbc:sqlserver://localhost:1433;DatabaseName=Student";
	private static String user="sa";
	private static String password="123456";
	
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("数据库连接失败");
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("数据库连接成功");
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("数据库连接失败");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(ResultSet rs,PreparedStatement ps,Connection conn) {
		if(rs	!=null) {
			try {
				rs.close();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(ps!=null) {
			try {
				ps.close();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
