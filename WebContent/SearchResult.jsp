<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="dao.Operation,bean.Visitor,java.util.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-warning">
<div class="container">
	<div class="row">
			<%
			Operation o = new Operation();
			String vdate= request.getParameter("vdate");
			Visitor v= new Visitor();
			// ArrayList<Visitor> alp=o.SearchVisitorList(vdate);
			%>
			<div class="col-sm-8">
			
			<h3 class="text-right text-upper text-danger">
				<a href="searchvisitor.jsp" class="btn btn-outline-info">Back To Search Page</a>
				<a href="home.jsp" class="btn btn-outline-info">Home Page</a>
			</h3>
			
			<table class="table table-responsive table-hover table-bordered">
				<tr class="bg-primary" style='color:white'>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Address</th>
					<th>Contact</th>
					<th>Qualification</th>
					<th>Purpose</th>
					<th>Date</th>
				</tr>
			<% 
			try {
				Connection con =o.makeConnection();
				PreparedStatement pst = con.prepareStatement("select * from visitor where vdate=?");
				pst.setString(1, vdate);
				ResultSet rst = pst.executeQuery();
				int i = 1;
				while (rst.next()) {
		
		%>
			
			<tr>
				<td><%= rst.getInt(1) %></td>
				<td><%= rst.getString(2) %></td>
				<td><%= rst.getString(3) %></td>
				<td><%= rst.getString(4) %></td>
				<td><%= rst.getInt(5) %></td>
				<td><%= rst.getString(6) %></td>
				<td><%= rst.getString(7) %></td>
				<td><%= rst.getString(8) %></td>
			
			</tr>
		<%
			}
			} catch (Exception e) {
				System.out.println(e);
			}
		%>
		</table>
		</div>
		</div>
	</div>
</div>
</body>
</html>