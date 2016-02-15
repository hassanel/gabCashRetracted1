
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Admin Page</title>
</head>
<body>
<table border=1>
<caption>Liste des clients :</caption>
<tr>
<td>Nom</td>
<td>Prénom</td>
</tr>
<c:forEach items="${listeClients}" var="c">
    <tr>
    	<td>
    		<a href="adminListeComptes?idClient=${c.idClient}"> ${c.nom} </a>
    	</td>
    	<td>
    		<a href="adminListeComptes?idClient=${c.idClient}"> ${c.prenom} </a>
    	</td>
    </tr>
</c:forEach>
</table>
<br/>
<a href="j_spring_security_logout">Se déconnecter</a>
</body>
</html>