<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
		<td>ID</td>
		<td>新闻标题</td>
		<td>地区</td>
		<td>新闻链接</td>
	</tr>
	<c:forEach items="${newses}" var="news">
	<tr>
		<td>${news.id}</td>
		<td>${news.title}</td>
		<td>${news.foreign ? '国外':'国内'}</td>
		<td><a href="${news.url}" target="_blank">${news.url}</a></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>