package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import entity.Student;

public class StudentAlterServlet extends HttpServlet{

	private StudentDao dao=new StudentDao();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String idString = request.getParameter("id");
		int id=Integer.parseInt(idString);
		String sno=request.getParameter("sno");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String agestr=request.getParameter("age");
		int age = Integer.parseInt(agestr);
		
		dao.alterById(id,sno,name,sex,age);
		List<Student> list=dao.queryALL();
		request.setAttribute("students", list);
		request.getRequestDispatcher("stulist.jsp").forward(request, response);
	}
}
