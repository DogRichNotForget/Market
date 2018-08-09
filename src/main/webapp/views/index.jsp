<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Hello World!</h2>
<table>
    <thead>
    <th>
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
<table>
    <thead>
    <th>
    <td>picId</td>
    <td> picAddress</td>
    </th>
    </thead>
    <tbody>
    <c:forEach  items="${picItem}" var="picItem">
        <tr>
            <td>${picItem.picId}</td>
            <td>${picItem.picAddress}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<table>
    <thead>
    <th>
    <td> telphone</td>

    </th>
    </thead>
    <tbody>
    <c:forEach items="${client}" var="client">
        <tr>
            <td>${client.telphone}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
