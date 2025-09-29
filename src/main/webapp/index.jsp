<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.newswebsite.model.Category" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>News Categories</title>
    <style>
        body { font-family: Arial, sans-serif; }
        ul { list-style-type: none; padding: 0; }
        li { margin: 10px 0; }
        a { text-decoration: none; color: #007BFF; }
        a:hover { text-decoration: underline; }
    </style>
</head>
<body>
<h2>News Categories</h2>
<ul>
    <c:forEach var="category" items="${categories}">
        <li>
            <a href="news?categoryId=${category.id}">${category.name}</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
