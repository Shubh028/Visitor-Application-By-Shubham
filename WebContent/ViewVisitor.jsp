
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="dao.Operation,bean.Visitor,java.util.*" %>
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
			Operation o= new Operation();
			 ArrayList<Visitor> alp=o.getVisitorList();
			%>
			<div class="col-sm-8">
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
					<th>Operation</th>
				</tr>
			
		<% 
			
		for(Visitor v : alp){
		%>	
			<tr>
				<td><%= v.getVid() %></td>
				<td><%= v.getVname() %></td>
				<td><%= v.getEmail() %></td>
				<td><%= v.getAddress() %></td>
				<td><%= v.getContact() %></td>
				<td><%= v.getQualification() %></td>
				<td><%= v.getPurpose() %></td>
				<td><%= v.getVdate() %></td>
				<td>
					<a href="DeleteVisitor?vid=<%=  v.getVid() %>" class="btn btn-outline-danger">Delete</a>&nbsp;&nbsp;&nbsp;
					<a href="editvisitor.jsp?vid=<%=  v.getVid() %>" class="btn btn-outline-info">Edit</a>
				</td> 
				
			</tr>
		<%
		}
		%>
		</table>
		</div>
		</div>
	</div>
</div>
</body>
</html>