<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>

<acme:form-textbox code="anonymous.penuela-bulletin.form.label.name" path="name"/>
<acme:form-textarea code="anonymous.penuela-bulletin.form.label.pros" path="pros"/>
<acme:form-textarea code="anonymous.penuela-bulletin.form.label.cons" path="cons"/>

<acme:form-submit code="anonymous.penuela-bulletin.form.button.create" action="/anonymous/penuelaBulletin/create"/>
<acme:form-return code="anonymous.penuela-bulletin.form.button.return"/>

</acme:form>
