<%@ page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.penuela-bulletin.list.label.name" path="name" width="204"/>
	<acme:list-column code="anonymous.penuela-bulletin.list.label.pros" path="pros" width="604"/>
	<acme:list-column code="anonymous.penuela-bulletin.list.label.cons" path="cons" width="604"/>
</acme:list>