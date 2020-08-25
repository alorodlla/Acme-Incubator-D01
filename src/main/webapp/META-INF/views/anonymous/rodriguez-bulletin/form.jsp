<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>

<acme:form-textbox code="anonymous.rodriguez-bulletin.form.label.project" path="project"/>
<acme:form-textbox code="anonymous.rodriguez-bulletin.form.label.company" path="company"/>
<acme:form-integer code="anonymous.rodriguez-bulletin.form.label.complexity" path="complexity"/>

<acme:form-submit code="anonymous.rodriguez-bulletin.form.button.create" action="/anonymous/rodriguezBulletin/create"/>
<acme:form-return code="anonymous.rodriguez-bulletin.form.button.return"/>

</acme:form>
