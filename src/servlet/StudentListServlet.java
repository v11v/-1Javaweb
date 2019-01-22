package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;

public class StudentListServlet extends HttpServlet {

	private StudentDao dao=new StudentDao();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<Student> list=dao.queryALL();
		
		request.setAttribute("students", list);
		request.getRequestDispatcher("stulist.jsp").forward(request, response);
	}
}
