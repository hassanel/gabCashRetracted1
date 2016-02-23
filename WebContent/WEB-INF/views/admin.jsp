
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Admin Page</title>
<link type="text/css" rel="stylesheet" href="/CSS/TableCSSCode.css" />
<style type="text/css">
<%@ include file="/CSS/TableCSSCode.css"%>
</style>
</head>
<body>
<div class="CSSTableGenerator" >
<table>
<caption>Liste des clients :</caption>
<tr>
<td>Nom</td>
<td>Prénom</td>
</tr>
<c:forEach items="${listeClients}" var="c">
    <tr>
    	<td>
    		<center><a href="adminListeComptes?idClient=${c.idClient}"> ${c.nom} </a></center>
    	</td>
    	<td>
    		<center><a href="adminListeComptes?idClient=${c.idClient}"> ${c.prenom} </a></center>
    	</td>
    </tr>
</c:forEach>
</table>
</div>
<br/>
<a href="j_spring_security_logout">Se déconnecter</a>
</body>
</html>