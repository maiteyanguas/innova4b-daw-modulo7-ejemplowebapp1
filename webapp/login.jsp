<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Login</title>
</head>
<body>
<form action="Login" method="post">
	<div>
		<c:if test="${error==true}">
			<p>Error en usuario introducido</p>
		</c:if>
	</div>
	<div>
		<table>
			<tr>
				<td>Usuario: </td>
				<td><input type="text" name="usuario"/></td>				
			</tr>
			<tr>
				<td>Contraseña: </td>
				<td><input type="password" name="password"/></td>				
			</tr>
			<tr>
				<td><input type="submit" value="Entrar"/> </td>
			</tr>
		</table>
	</div>
</form>
</body>
</html>