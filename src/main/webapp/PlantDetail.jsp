<%@page import="air_quality_and_plant.Plant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Plant Details</title>
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
	text-decoration: none;
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
#main{
text-decoration: none;
}
</style>
</head>
<body
	background="https://wallpaperaccess.com/full/5205022.jpg">
	<%
	List<Plant> plant = (List) request.getAttribute("plantList");
	%>
	<div class="container">
		<h1>Suggested Plant</h1>
		<h2>Plant Details</h2>
		<table border="0px">
		
			<%
			for (Plant pt : plant) {
			%>
			<tr>
				<th>Plant</th>
				<th>Image</th>
			</tr>
			<tr>
				<td>
					<table>
						<br>
						<tr>
							<b>Plant Scientific Name :</b>
							<%=pt.getSciName()%></tr>
						<br>
						<tr>
						<b>Plant Common Name :</b>
							<%=pt.getCommName()%>
						</tr>
						<br>
						<tr>
							<b>Plant Description :</b>
							<%=pt.getDescription()%></tr>
						<br>
						<tr>
							<b>Plant Origin :</b>
							<%=pt.getOrigin()%></tr>
						<br>
						<tr>
							<b>Plant Species :</b>
							<%=pt.getSpecies()%></tr>
					<%--	<br>
						<tr>
							Plant Radius :
							<%=pt.getRadius()%>
						</tr> --%>
						<br>
						<tr>
							<b> 
							 Gas Absorb :</b>
							<%=pt.getGases()%>
						</tr>
						<br>
						<tr>
							<a href=<%=pt.getLink()%>><b>More About >>></b></a>
						</tr>
					</table>
				</td>
				<td><img alt=<%=pt.getCommName()%> src=<%=pt.getImg()%> style="height: 150px; width: 150px">
				</td>
			</tr>

			<%
			}
			%>
		</table>
			<h3>Thank You...</h3>
		
		<a href="roomdetails">
			<button>Check Room Details !!! </button>
		</a>
		
		<a href="airdetails">
			<button id="main">Air Details !!!</button>
		</a>
		<a href="Welcome.jsp" class="home-button">Home</a>
	</div>
</body>
</html>