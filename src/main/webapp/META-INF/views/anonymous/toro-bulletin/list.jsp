<%@ page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.toro-bulletin.list.label.author" path="author" width="204"/>
	<acme:list-column code="anonymous.toro-bulletin.list.label.likes" path="likes" width="604"/>
	<acme:list-column code="anonymous.toro-bulletin.list.label.dislikes" path="dislikes" width="604"/>

</acme:list>