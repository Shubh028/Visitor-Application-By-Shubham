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
		<form action="LoginCheck" method="post">
		<div class="form-group">
					<label>Enter Email</label> <input type="text" class="form-control"
						name="email">
		</div>
		<div class="form-group">
					<label>Enter Password</label> <input type="password"
						class="form-control" name="password">
		</div>
				
		<button type="submit" class="btn btn-primary">login</button>
	</form>
	</div>
</div>
</body>
</html>