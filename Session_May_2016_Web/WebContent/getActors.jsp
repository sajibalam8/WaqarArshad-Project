<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.may.domain.Actor"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List actors = (ArrayList) request.getAttribute("actorList");
	%>
	<table style="width: 100%" id="table1">
		<tr>
			<td><b>First Name</b></td>
			<td>Last name</td>
			<td> Films</td>
		</tr>
		<%
			for (int i = 0; i < actors.size(); i++) {
				Actor actor = (Actor) actors.get(i);
		%>
		<tr>
			<td><%=actor.getFirstName()%></td>
			<td><%=actor.getLastName()%></td>
			<td><a href="GetFilmsByActor?actorId=<%=actor.getId()%>&actorName=<%=actor.getLastName()%>">Films</a></td>
		</tr>
		<%
			}
		%>



	</table>



</body>
</html>