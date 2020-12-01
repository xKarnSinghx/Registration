<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MedCare</title>
<style>
 html {
 background-color: #5fcff6;
 }
 body {
 font-family: "Lucida Console", Courier, monospace;
 margin: 60px;
 font-size: 20px;
 }
input::-webkit-outer-spin-button,
 input::-webkit-inner-spin-button {
 -webkit-appearance: none;
 margin: 0;
 }
 input{
 border: solid cornflowerblue 2px;
 border-radius: 5px;
 padding: 12px 20px;
 font-size: 20px;
 }

h3 {
text-align: center;
font-size: 2rem;
margin: 50px auto;
background-color: rgb(59, 155, 0);
 }

 </style>
</head>
<body>
<br><br><br>
<h3>You have successfully logged in.</h3><br>
 <br>
 <br>
 <form action="Logout" method="post">
 <input type="submit" value="Logout">
 </form>
</body>
</html>
