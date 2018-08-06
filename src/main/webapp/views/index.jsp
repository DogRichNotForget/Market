<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Hello World!</h2>
<table>
    <thead>
    <th>
    <td>itemId</td>
    <td>launchTime</td>
    <td> itemName</td>
    <td> price</td>
    <td> itemType</td>
    <td> descr</td>
    <td>  pic</td>
    <td> clientId</td>

    </th>
    </thead>
    <tbody>
    <c:forEach items="${items}" var="items">
        <tr>
            <td>${items.itemId}</td>
            <td>${items.launchTime}</td>
            <td>${items.itemName}</td>
            <td>${items.price}</td>
            <td>${items.itemType}</td>
            <td>${items.descr}</td>
            <td>${items.pic}</td>
            <td>${items.clientId}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
