
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Client Page</title>
<link type="text/css" rel="stylesheet" href="/CSS/TableCSSCode.css" />
<style type="text/css">
<%@ include file="/CSS/TableCSSCode.css"%>
</style>
</head>
<body>
<div class="CSSTableGenerator" >
<table>
<caption>Liste des transactions du compte num ${compte.idCompte}:</caption>
<tr>
<td>Id</td>
<td>Montant</td>
<td>Date</td>
</tr>
<c:forEach items="${listeTransactions}" var="t">
    <tr>
    	<td>
    		 ${t.idtransaction}
    	</td>
    	<td>
    		 ${t.montant} 
    	</td>
    	<td>
    		${t.date}
    	</td>
    </tr>
</c:forEach>
</table>
</div>
<br/>
<a href="j_spring_security_logout">Se déconnecter</a>
</body>
</html>