<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>

<acme:form-textbox code="anonymous.martinezBulletin.form.label.autor" path="autor"/>
<acme:form-textbox code="anonymous.martinezBulletin.form.label.nota" path="nota"/>
<acme:form-textarea code="anonymous.martinezBulletin.form.label.comentarios" path="comentarios"/>

<acme:form-submit code="anonymous.martinezBulletin.form.button.create" action="/anonymous/martinez-bulletin/create"/>
<acme:form-return code="anonymous.martinezBulletin.form.button.return"/>

</acme:form>
