<%@page import="java.util.Date"%>
<%@page import="air_quality_and_plant.PrepareOutput"%>
<%@page import="java.util.List"%>
<%@page import="air_quality_and_plant.MQOutput"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Air Quality Details</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.container {
	max-width: 800px;
	margin: 0 auto;
	padding: 20px;
}

h1, h2 {
	text-align: center;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

th {
	background-color: #f2f2f2;
}

button {
	display: block;
	margin: 20px auto;
	padding: 10px 20px;
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.home-button {
	display: block;
	margin: 20px auto;
	padding: 10px 20px;
	background-color: #007bff;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	text-decoration: none;
	text-align: center;
	width: fit-content;
}
</style>
</head>
<body
	background="https://wallpaperaccess.com/full/5205022.jpg">
	<div class="container">
	<% List<PrepareOutput> data=(List)request.getAttribute("list"); 
	%>
		<h1>Dust Molecules Present</h1>
		<h2>Air Quality Details...</h2>
		<table>
		<%for(PrepareOutput output: data){ 
		String dt=output.getDate();
		//Date date= format.parse(dbdate);
		//java.util.Date dateOfJoin= format.parse( dbdate);
		%>
			<tr>
				<th >Date : </th>
				<th> <%=dt%></th>
				
			</tr>
			<tr>
				<td><b>Smoke :</b></td><td>  <%=output.getMq2() %></td> 
				
			</tr>
			<tr>
				<td><b> Alcohol: </b></td><td>  <%=output.getMq3() %></td> 
				
			</tr>
			
			<tr>
				<td><b>Methane/CNG:</b>  </td><td> <%=output.getMq4() %></td> 
				
			</tr>
			<tr>
				<td><b>LPG/natural gas:</b></td><td>  <%=output.getMq5() %></td> 
				
			</tr>
			<tr>
				<td><b>Carbon Monoxide(CO):</b> </td><td>  <%=output.getMq7() %></td> 
				
			</tr>
			<tr>
				<td><b>Hydrogen Gas: </b> </td><td><%=output.getMq8() %></td> 
			</tr>
			<tr>
				<td><b>Flammable Gas:</b></td><td>   <%=output.getMq9() %></td> 
			</tr>
			<tr>
				<td><b>Ammonia/ Benzen Gas:</b> </td><td>  <%=output.getMq135() %></td> 
			</tr>
			<tr></tr>
		<%} %>
		
		</table>
		<a href="plantdetails">
			<button>Suggest me a Plant !!!</button>
		</a> 
		<a href="roomdetails">
			<button>Check Room Details!!! </button>
		</a>
		
		<a href="Welcome.jsp" class="home-button">Home</a>
	</div>
</body>
</html>