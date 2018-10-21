<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="Banner.jsp"></jsp:include>
	<jsp:include page="Menu.jsp"></jsp:include>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
		</tr>
		<c:forEach var="employee" items="${employees}">
			<tr>
				<td>${employee.empId}</td>
				<td>${employee.empName}</td>
				<td>${employee.empAddress}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>