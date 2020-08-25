<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>

<acme:form-textbox code="anonymous.toro-bulletin.form.label.author" path="author"/>
<acme:form-textarea code="anonymous.toro-bulletin.form.label.likes" path="likes"/>
<acme:form-textarea code="anonymous.toro-bulletin.form.label.dislikes" path="dislikes"/>

<acme:form-submit code="anonymous.toro-bulletin.form.button.create" action="/anonymous/toroBulletin/create"/>
<acme:form-return code="anonymous.toro-bulletin.form.button.return"/>

</acme:form>