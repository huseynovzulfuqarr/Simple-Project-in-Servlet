package contextServlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="ReadFileContextServlet",urlPatterns = {"/ReadFileContextServlet"})
public class ReadFileContextServlet extends HttpServlet{
@Override
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	javax.servlet.ServletContext context=getServletContext();
	InputStream reader=context.getResourceAsStream("/WEB-INF/ilkay.txt");
	int content;
	while((content=reader.read())!=-1) {
		response.getWriter().write(content);
	}
	
}
}
