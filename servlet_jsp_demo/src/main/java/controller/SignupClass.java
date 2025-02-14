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

@WebServlet("/signup")
public class SignupClass extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("name");
		int userAge = Integer.parseInt(req.getParameter("age"));
		String userAddress = req.getParameter("address");
		long userPhone = Long.parseLong(req.getParameter("phone"));
		String userEmail = req.getParameter("email");
		String userPassword = req.getParameter("password");
		
		User user = new User();
		
		user.setUserName(userName);
		user.setUserAge(userAge);
		user.setUserAddress(userAddress);
		user.setUserPhone(userPhone);
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);
		
		UserDao userDao = new UserDao();
		
		User dbuser = userDao.saveUser(user);
		if(dbuser != null) {
			req.setAttribute("key", "Successfully signUp please Login..");
			resp.sendRedirect("Login.jsp");
//			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
//			requestDispatcher.forward(req, resp);
		}
 	}
	
}
