<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>Listado general de anuncios</div>
	<table>
		<c:forEach items="${lista}" var="anuncio">
			<tr>
				<td><a href="AnyadirFavorito?id=${anuncio.id}">${anuncio.texto}</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="principal.jsp">Volver al inicio</a>
</body>
</html>