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
    <%
        List<Category> categories = (List<Category>) request.getAttribute("categories");
        if (categories != null && !categories.isEmpty()) {
            for (Category c : categories) {
    %>
        <li>
            <a href="news?categoryId=<%=c.getId()%>"><%=c.getName()%></a>
        </li>
    <%
            }
        } else {
    %>
        <li>No categories found</li>
    <%
        }
    %>
</ul>
</body>
</html>
