package Request;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/responseServlet")
public class ResponseServlet extends HttpServlet{
@Override
public void doGet(HttpServletRequest request,HttpServletResponse response) {
	response.setHeader("dost","murad memmedzade");
	response.setHeader("dost", "eltac asadullayev");
	response.setIntHeader("yash", 20);
response.addHeader("dost", "rufat ismayilov");
}
	
	
	
	
	
}
