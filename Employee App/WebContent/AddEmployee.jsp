<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Application</title>
</head>
<body>
	<jsp:include page="Banner.jsp"></jsp:include>
	<jsp:include page="Menu.jsp"></jsp:include>
	<form action="EmployeeController?menu=add" method="post">

		<table rowspacing="5" cellspacing="5" align="center">

			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="empId"></td>
			</tr>

			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="empName"></td>
			</tr>

			<tr>
				<td>Employee Address</td>
				<td><textarea name="empAddress"></textarea></td>
			</tr>
			<tr>
				<td>${param.msg}</td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="Save"> <input
					type="reset" value="Clear All"></th>

			</tr>

		</table>
	</form>
	<hr>
	<c:if test="${employees ne null}">
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
	</c:if>
</body>
</html>