<%@ page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.martinezBulletin.list.label.autor" path="autor" width="204"/>
	<acme:list-column code="anonymous.martinezBulletin.list.label.nota" path="nota" width="54"/>
	<acme:list-column code="anonymous.martinezBulletin.list.label.comentario" path="comentarios" width="554"/>
	

</acme:list>