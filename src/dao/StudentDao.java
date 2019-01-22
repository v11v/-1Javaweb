package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

import entity.Student;
import jdk.nashorn.internal.ir.WhileNode;
import utils.DBConnection;

public class StudentDao {
	public List<Student> queryALL(){
		List<Student> list=new ArrayList<Student>();
		Connection conn= DBConnection.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			ps=conn.prepareStatement("select * from student");
			rs=ps.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1), rs.getString(3), 
						rs.getString(2),rs.getString(4), rs.getInt(5)));
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBConnection.close(rs, ps, conn);
		}
		return list;
	}
	
	public void delById(int id) {
		Connection conn = DBConnection.getConn();
		String sql="delete from student where id=?";
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBConnection.close(null, ps, conn);
		}
	}
	
	public void addstudent(int id,String sno,String name,String sex,int age) {
		Connection conn=DBConnection.getConn();
		String sql="insert into student values(?,?,?,?,?)";
		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, sno);
			ps.setString(4, sex);
			ps.setInt(5, age);
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBConnection.close(null, ps, conn);
		}
	}
	
	public Student queryById(int id) {
		Connection conn=DBConnection.getConn();
		String sql="select * from student where id=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Student student =null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while (rs.next()) {
				student = new Student(rs.getInt(1), rs.getString(3),
						rs.getString(2), rs.getString(4), rs.getInt(5));
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBConnection.close(null, ps, conn);
		}
		return student;
	}
	
	public void alterById(int id,String sno,String name,String sex,int age) {
		Connection conn=DBConnection.getConn();
		String sql="update student set sno=?,name=?,sex=?,age=? where id=?";
		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(5, id);
			ps.setString(2, name);
			ps.setString(1, sno);
			ps.setString(3, sex);
			ps.setInt(4, age);
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBConnection.close(null, ps, conn);
		}
	}
}
