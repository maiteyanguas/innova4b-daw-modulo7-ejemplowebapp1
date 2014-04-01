<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Home</title>
</head>
<body>
	<p>Hola ${usuario}</p>
		<c:forEach items="${cookie}" var="thisCookie">
			<c:if test="${thisCookie.value.name=='JSESSIONID'}">
				<p>Tu Id de sesión es: <c:out value="${thisCookie.value.value}"></c:out></p>
			</c:if>
			<c:if test="${thisCookie.value.name=='prueba'}">
				<p>Tu Cookie es: <c:out value="${thisCookie.value.value}"></c:out></p>
			</c:if>
		</c:forEach>
	<p>
		<a href="/Empleado">Empleado</a>
	</p>
	<p>
		<a href="/Logout">Salir</a>
	</p>
</body>
</html>