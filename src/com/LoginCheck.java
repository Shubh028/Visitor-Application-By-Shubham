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

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginCheck() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
//		int adm_id = Integer.parseInt(req.getParameter("adm_id"));
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		Admin a= new Admin();
		Operation o = new Operation();
		
		if(o.Validate(email,password)){
			System.out.println("<h2 style='color:green'>Login Successful...!!</h2>");
			RequestDispatcher rd= request.getRequestDispatcher("/home.jsp");
			rd.forward(request, response);
		}else{
			System.out.println("sorry email or password error");
			RequestDispatcher rd= request.getRequestDispatcher("/loggincheck.jsp");
			rd.forward(request, response);
	}
}
}
