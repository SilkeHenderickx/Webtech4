<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="/resources/css/bootstrap.min.css">

<title>Result</title>
</head>

<body>

<div class='well'>
<h1>Grade</h1>
<br/><br/>
<table  class='table'>
	<tr>
		<th>First name</th>
		<th>Last name</th>
		<th>Grade</th>
	</tr>
	<tr>
		<td>${firstName}</td>
		<td>${lastName}</td>
		<td>${grade}</td>
	</tr>

</table>

<br/><br/>
<a href='/'>Grade a student</a>
</div>

</body>
</html>

