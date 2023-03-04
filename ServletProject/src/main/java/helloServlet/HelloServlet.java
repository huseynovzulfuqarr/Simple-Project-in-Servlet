package helloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	PrintWriter writer=response.getWriter();
	writer.write("<html><body>");
	String message="<h1>Employee ManageMent System<h1>"
			+ "<label>Firstname:</label>"
			+ "<input type="
			+ "text/>";
	writer.write(message);
	writer.write("</html></body>");
}
}
