<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MedCare</title><style>
html {
background-color: #5fdcf1;
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
h1 {
text-align: center;
font-size: 4rem;
margin: 50px auto;
background-color: rgb(9, 255, 0);
 }
td {
margin-left: 50px;
 }
</style>
</head>
<body><h1>Sign Up </h1>
<form action="Register" method="post"><fieldset>
<table>
<tr><td>Username: </td><td><input type="text" name="uname"></td></tr>
<tr><td>Password: </td><td><input type="text" name="password"></td></tr>
<tr><td>Email: </td><td><input type="text" name="email"></td></tr>
<tr><td>phone: </td><td><input type="number" name="phone"></td></tr>
<tr><td></td><td><input type="submit" value="Sign Up"></td></tr>
</table></fieldset>
</form>
</body>
</html>
