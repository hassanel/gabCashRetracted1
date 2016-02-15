
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Admin Page</title>
</head>
<body>
<table border=1>
<caption>Liste des comptes :</caption>
<tr>
<td>Id</td>
<td>Montant</td>
</tr>
<c:forEach items="${listeComptes}" var="c">
    <tr>
    	<td>
    		<a href="adminListeTransactions?idCompte=${c.idCompte}"> ${c.idCompte} </a>
    	</td>
    	<td>
    		 ${c.montant} 
    	</td>
    </tr>
</c:forEach>
</table>
<br/>
<a href="j_spring_security_logout">Se déconnecter</a>
</body>
</html>