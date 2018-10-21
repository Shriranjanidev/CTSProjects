<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Banner.jsp"></jsp:include>
	<jsp:include page="Menu.jsp"></jsp:include>
	<form action="EmployeeController?menu=find" method="post">
		Employee Id: <input type="text" name="empId"><br> <input
			type="submit" value="Find">
			<br>
			${param.msg}
	</form>
	<c:if test="${employee ne null}">
		<table>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Address</td>
			</tr>
			<tr>
				<td>${employee.empId}</td>
				<td>${employee.empName}</td>
				<td>${employee.empAddress}</td>
			</tr>
		</table>
	</c:if>
</body>
</html>