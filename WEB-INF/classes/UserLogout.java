import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserLogout extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		HttpSession session = request.getSession();
		session.removeAttribute("uname");
		session.invalidate();
		RequestDispatcher rd = request.getRequestDispatcher("./blood.jsp");
		rd.include(request, response);
		//response.sendRedirect("./blood.jsp");
	}
}