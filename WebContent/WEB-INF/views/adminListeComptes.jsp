
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
<caption>Liste des comptes de ${client.nom} ${client.prenom} :</caption>
<tr>
<td>Id</td>
<td>Montant</td>
</tr>
<c:forEach items="${listeComptes}" var="c">
    <tr>
    	<td>
    		<center><a href="adminListeTransactions?idCompte=${c.idCompte}"> ${c.idCompte} </a></center>
    	</td>
    	<td>
    		 ${c.montant} 
    	</td>
    </tr>
</c:forEach>

</table>
</div>
<br/>
<a href="j_spring_security_logout">Se déconnecter</a>
</body>
</html>