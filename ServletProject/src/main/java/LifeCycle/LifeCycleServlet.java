package LifeCycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/lifeCycle")
public class LifeCycleServlet extends HttpServlet {
@Override
public void init() {
	System.out.println("init metodu chagirildi ");
}
@Override
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	PrintWriter writer=response.getWriter();
	writer.write("Spring boot Servlet Jsp");
}
}
