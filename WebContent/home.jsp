<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-warning">
<div class="container">
	<div class="col-md-4">
		<h3 class="text-center text-upper text-danger">Welcome to Visitors App</h3>
		<form action="login" method="post">
		<div class="form-group">
			<a href="register.jsp">Registration of New Visitor</a>
		</div>
		<div class="form-group">
			<a href="view.jsp">View Visitor Detail</a>
		</div>
		<div class="form-group">
			<a href="searchvisitor.jsp">Search for Visitor</a>
		</div>
		<div class="form-group">
			<a href="Logout">Logout</a>
		</div>
	</form>
	</div>
</div>
</body>
</html>