<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="/resource/mystyles.css">
</head>
<body>
	<form action="list" method="post">
	电影名称<input type="text" name="name" > <br><br>
	  导演<input type="text" name="actor" ><br><br>
	  价格<input type="text" name="priceStart">-<input type="text" name="priceEnd"><br><br>
	<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<td>序号</td>
			<td>电影名称</td>
			<td>导演</td>
			<td>上映时间</td>
			<td>价格</td>
			<td>时长</td>
			<td>类型</td>
			<td>年份</td>
		</tr>
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.id }</td>
				<td>${l.name }</td>
				<td>${l.actor }</td>
				<td>${l.uptime }</td>
				<td>${l.price }</td>
				<td>${l.longtime }</td>
				<td>${l.type }</td>
				<td>${l.year }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="8">
			当前页面：${info.pageNum }/${info.pages },共${info.total }页
			<a href="list?pageNum=${info.pageNum=1 }">首页</a>
			<a href="list?pageNum=${info.nextPage}">下一页</a>
			<a href="list?pageNum=${info.prePage }">上一页</a>
			<a href="list?pageNum=${info.pages}">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>