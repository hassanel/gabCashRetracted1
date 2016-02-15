
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Client Page</title>
</head>
<body>
<table border=1>
<caption>Liste des transactions :</caption>
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
<br/>
<ul>
<c:forEach items="${listeTransactions}" var="t">
    <li> ${c.idtransaction} ${c.date} ${c.montant} 
    </li>
</c:forEach>
</ul>
<a href="j_spring_security_logout">Se déconnecter</a>
</body>
</html>