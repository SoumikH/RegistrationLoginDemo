package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class RegistrationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		PrintWriter out = response.getWriter();
		String Fname = request.getParameter("firstname");
		String Lname = request.getParameter("lastname");
		String password = request.getParameter("password");
		String sql = "insert into registrationdemo1 (Fname,Lname,password) values (?,?,?)";

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			Connection conn = DriverManager.getConnection(url, "system", "123");
			// Statement st = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Fname);
			ps.setString(2, Lname);
			ps.setString(3, password);
			ResultSet rs=ps.executeQuery();
			int i = ps.executeUpdate();
			HttpSession hs = request.getSession();
			hs.setAttribute("fname", Fname);
			hs.setAttribute("lastname", Lname);
			if (i > 0) {
				// out.println("Values inserted");

				response.sendRedirect("ValuesInserted.jsp");
			} else {
				out.println("values not inserted");
			}

		} catch (Exception ex) {
			out.println(ex);
		}
	}

}
