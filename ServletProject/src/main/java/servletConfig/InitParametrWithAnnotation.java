package servletConfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="initParametrWithAnnotation",urlPatterns = {"/initParametrWithAnnotation"},initParams = 
{@WebInitParam(name="hz",value = "Huseynov Zulfuqar"),@WebInitParam( name="mm",value = "Murad Memmedzade")})
public class InitParametrWithAnnotation extends HttpServlet{
@Override
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	PrintWriter writer=response.getWriter();
javax.servlet.ServletConfig config=getServletConfig();
	writer.write(config.getInitParameter("hz"));
	writer.write(config.getInitParameter("mm"));
	Enumeration<String> list=config.getInitParameterNames();
	while(list.hasMoreElements()) {
		String str=(String)list.nextElement();
		writer.write(str+" ");
	}
	
}
}
