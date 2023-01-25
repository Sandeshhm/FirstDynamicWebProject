<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-sm">
<c:forEach var="emp" items="${Employees}"> 
<tr><td>  <c:out value="${emp.emp_name}"/> </td>
	<td><c:out value="${emp.dept_name}"/></td>
	<td><c:out value="${emp.phone_num}"/></td></tr>
</c:forEach>
</table>
</body>
</html>