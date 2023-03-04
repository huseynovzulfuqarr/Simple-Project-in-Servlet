package Request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/requestServlet")
public class RequestServlet extends HttpServlet{
@Override
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	PrintWriter writer=response.getWriter();
	String serverName=request.getServerName();
	int serverPort=request.getServerPort();
	String server=request.getServletPath();
	int remotePort=request.getRemotePort();
	Enumeration<String> header=request.getHeaderNames();
	while (header.hasMoreElements()) {
		String string = (String) header.nextElement();
		writer.write(string+" ");
		
	}
	writer.write(" "+serverName+" ");
	writer.write(" "+serverPort+" ");
	writer.write(" "+server+" ");
	writer.write(" "+remotePort+" ");

}
}
