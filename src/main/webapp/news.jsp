<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News</title>
</head>
<body>
<h2>News Headlines</h2>
<c:if test="${not empty newsList}">
    <ul>
        <c:forEach var="news" items="${newsList}">
            <li>
                <a href="newsDetail?newsId=${news.id}">${news.title}</a>
            </li>
        </c:forEach>
    </ul>
</c:if>
<c:if test="${empty newsList}">
    <p>No news found in this category.</p>
</c:if>
<a href="categories">Back to Categories</a>
</body>
</html>
