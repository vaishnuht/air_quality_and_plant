<%@page import="air_quality_and_plant.RoomDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Room Details</title>
<link rel="stylesheet" href="Style.css">
</head>
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
#main {
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
body {
  background-image: url('https://wallpaperaccess.com/full/5205022.jpg');
}

</style>


    

<body>
<h1>Room Plant Details</h1>
<%List<RoomDetails> list=(List)request.getAttribute("roomdetails"); %>
<div class="container">

 <table>
  <tr>
    <th><b>Room_no</b></th>
    <th><b>Plant_Name</b></th>
    <th><b>Date</b></th>
    <th></th>
  </tr>
  <%for(RoomDetails details : list){ %>
  <tr>
    <td><%=details.getRoomNo() %></td>
    <td><%=details.getPlantName() %></td>
    <td><%=details.getDate() %></td>
    
    <td><a  href="deletePlant?id=<%=details.getId()%>"><button> Remove Plant</button></a></td>
  </tr>
  <%} %>
</table>
<br>
<form action="addplant" method="POST">
	Room Number : <input type="number" name="roomno"><br><br>
	Plant name : <input type="text" name="plant"><br><br>
	Date : <input type="date" name="date"><br>
  
  <button type="submit" value="Submit" class="home-button">Add Plant To Room </button>
</form> 
<a href="plantdetails">
			<button id="main">Suggest me a Plant !!!</button>
		</a>
		<a href="airdetails">
			<button id="main">Air Details !!!</button>
		</a>
		
</div>


</body>
</html>