package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.User;

@WebServlet("/update")
public class UpdateClass extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("userId"));
		
		UserDao userDao = new UserDao();
		User dbUser = userDao.fetchById(id);
		
		if(dbUser != null) {
			req.setAttribute("key", dbUser);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Edit.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
	
}
