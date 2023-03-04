package Annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/helloServlet")
public class AnnotationServlet  extends HttpServlet{
@Override
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	PrintWriter writer=response.getWriter();
	writer.write("men servlet ve jsp oyrenirem");
}
}
