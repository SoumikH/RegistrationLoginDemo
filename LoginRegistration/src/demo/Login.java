package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String dbfname = null;
		String dbpassword = null;
		String dbLname = null;
		String sql = "select * from registrationdemo1 where Fname=? and password=?";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, "system", "123");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dbfname = rs.getString("Fname");
				dbLname = rs.getString("Lname");
				dbpassword = rs.getString("password");
			}
			if (name.equals(dbfname) && password.equals(dbpassword)) {

				// out.println("you are successfully loged in");
				HttpSession hs = request.getSession();

				hs.setAttribute("fname", name);
				hs.setAttribute("lastname", dbLname);

				response.sendRedirect("Welcome.jsp");
			} else {
				response.sendRedirect("WrongCredentials.jsp");
				// out.println("WrongCredentials");
			}
		} catch (Exception e) {
			out.println(e);
		}
	}
}
