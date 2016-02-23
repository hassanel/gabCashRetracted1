<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<html>
<head>
<title>login</title>
<style type="text/css">

.auth{
	width : 50%;
	margin-top : 10%;
	border : 2px black solid;
}
</style>
</head>
<body>
<center>
<div class="auth">
<h1>Page d'authentification </h1>

<c:if test="${not empty msg_erreur}">
${msg_erreur}
</c:if>

<c:if test="${not empty msg_logout}">
${msg_logout}
</c:if>


<form action="j_spring_security_check" method="post">
<table>
<tr>
  <td>Nom d'utilisateur</td><td><input type="text" name="username"/></td>
</tr>
<tr>
  <td>Mot de passe</td><td><input type="password" name="password"/></td>
</tr>
<tr>
  <td colspan="2" align="center"><input type="submit" value="Valider"/></td>
</tr>

</table>
</div>
</center>
</form>


</body>
</html>