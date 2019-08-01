<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="500">
		<caption>火车车次详情</caption>
		<tr>
			<td>车次</td>
			<td>${ train.trainno }</td>
		</tr>
		<tr>
			<td>发车--到达</td>
			<td>${ train.startstation}--${ train.arrivalstation }</td>
		</tr>
		<tr>
			<td>发时--到时</td>
			<td>${ train.starttime}--${ train.arrivaltime }</td>
		</tr>
		<tr>
			<td>运行时间(小时)</td>
			<td>${ train.runtime }</td>
		</tr>
		<tr>
			<td>里程(公里)</td>
			<td>${ train.mile }</td>
		</tr>
	</table>
	<a href="javascript:history.back()">返回</a>
</body>
</html>