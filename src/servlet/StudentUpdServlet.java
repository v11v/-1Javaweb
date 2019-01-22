package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import entity.Student;

public class StudentUpdServlet extends HttpServlet{

	private StudentDao dao=new StudentDao();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		int id=Integer.parseInt(idString);
		
		Student student=dao.queryById(id);
		request.setAttribute("students", student);
		request.getRequestDispatcher("alterstudent.jsp").forward(request, response);
	}
}
