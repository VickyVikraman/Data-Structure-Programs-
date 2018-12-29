package com.vigraman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("add")
public class AddingServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a,b;
		a=Integer.parseInt(request.getParameter("t1"));
		b=Integer.parseInt(request.getParameter("t2"));
		int c=a+b;
		PrintWriter out=response.getWriter();
		out.println(c);
	}
}
