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

@WebServlet("/login")
public class LoginClass extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String frontendEmail = req.getParameter("email");
		String frontendPassword = req.getParameter("pwd");
		
		UserDao userDao = new UserDao();
		User dbuser = userDao.fetchUserByEmail(frontendEmail);
		
		if (dbuser != null) {
			if (frontendPassword.equals(dbuser.getUserPassword())) {
				
//				List<User> list = userDao.fetchAll();
//				req.setAttribute("key", list);
				
				User user = userDao.fetchUserByEmail(frontendEmail);
				req.setAttribute("key", dbuser);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("Display.jsp");
				requestDispatcher.forward(req, resp);
			} else {
				req.setAttribute("key", "Invalid UserName/Password please enter correct Credentals");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
				requestDispatcher.forward(req, resp);
			}
		}
	}
}
