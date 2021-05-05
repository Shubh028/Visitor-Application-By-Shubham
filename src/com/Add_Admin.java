package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Admin;
import dao.Operation;


@WebServlet("/Add_Admin")
public class Add_Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Add_Admin() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("aid"));
		System.out.println("admin id "+id);
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		Admin a= new Admin();
		Operation o = new Operation();
		
		a.setAid(id);
		a.setEmail(email);
		a.setPassword(password);
		
		if (o.AddAdmin(a)!=0) {
			System.out.println("Admin  Added....!!!!");
			
		} else {
			System.out.println("error in visitor addition");
		}
		RequestDispatcher rd= request.getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
	}

}
