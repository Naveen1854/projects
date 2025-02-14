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
public class SignUpClass extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String adddress = req.getParameter("address");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");

		User user = new User();

		user.setUserName(name);
		user.setUserAge(age);
		user.setUserAddress(adddress);
		user.setUserEmail(email);
		user.setUserPhone(phone);
		user.setUserPassword(password);

		UserDao userDao = new UserDao();

		User dbuser = userDao.saveUser(user);
		if (dbuser != null) {
			req.setAttribute("key", "Successfully Signed Up Please Login..");

//			resp.sendRedirect("Login.jsp");

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
			requestDispatcher.forward(req, resp);

		}

	}

}
