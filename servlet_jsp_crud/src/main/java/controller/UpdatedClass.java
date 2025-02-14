package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.User;

@WebServlet("/updated")
public class UpdatedClass extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int userId = Integer.parseInt(req.getParameter("id"));
		String userName = req.getParameter("name");
		int userAge = Integer.parseInt(req.getParameter("age"));
		String userAddress = req.getParameter("address");
		long userPhone = Long.parseLong(req.getParameter("phone"));
		String userEmail = req.getParameter("email");
		String userPassword = req.getParameter("password");
		
		User newUser = new User();
		newUser.setUserId(userId);
		newUser.setUserName(userName);
		newUser.setUserAddress(userAddress);
		newUser.setUserPhone(userPhone);
		newUser.setUserEmail(userEmail);
		newUser.setUserPassword(userPassword);
		
		UserDao userDao = new UserDao();
		User updatedUser = userDao.updateUser(newUser);
		
		if(updatedUser != null) {
			List<User> list = userDao.fetchAll();
			req.setAttribute("key", list);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Display.jsp");
			requestDispatcher.forward(req, resp);
		}
  	}
	
}
