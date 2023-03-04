package contextServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContext extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		javax.servlet.ServletContext context=getServletContext();
		PrintWriter writer=response.getWriter();
		writer.write(context.getInitParameter("ee")+" ");
		writer.write(context.getInitParameter("hz")+" ");
	Enumeration<String> list=context.getInitParameterNames();
	while(list.hasMoreElements()) {
		String str=list.nextElement();
		writer.write(" "+str+" ");
	}
	writer.close();
	}
	
	
	

}
