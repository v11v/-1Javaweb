package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.DBConnection;

public class UserDao {
	public boolean login(String username,String password) {
		Connection conn=DBConnection.getConn();
		PreparedStatement ps=null;
		String sql = "select * from admin where username=? and password=? ";
		ResultSet rs=null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2,password);
			rs=ps.executeQuery();
			while (rs.next()) {
				return true;
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally {
			DBConnection.close(rs, ps, conn);
		}
		return false;
	}
}
