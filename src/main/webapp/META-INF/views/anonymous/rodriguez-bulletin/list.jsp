<%@ page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.rodriguez-bulletin.list.label.project" path="project" width="204"/>
	<acme:list-column code="anonymous.rodriguez-bulletin.list.label.company" path="company" width="204"/>
	<acme:list-column code="anonymous.rodriguez-bulletin.list.label.complexity" path="complexity" width="204"/>

</acme:list>