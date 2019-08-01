<%@page import="com.neu.entity.Traininfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function del(){
	var arr = document.getElementsByName("trainno");
	var sum = 0;
	for(i = 0;i<arr.length;i++){
		if(arr[i].checked){
			sum++;
		}
	}
	if(sum == 0){
		alert("请选择车次!");
		return;
	}
	document.forms[0].submit();
}
</script>
</head>
<body>
	${ !(empty param.success)?"<script>alert('删除成功!')</script>":"" }
	<form action="${ pageContext.request.contextPath }/GetDelTrainServlet" method="post">
		<table border="1" width="800">
			<tr align="center">
				<th><a href="#" onclick="del()">删除</a></th>
				<th>车次</th>
				<th>发车--到达</th>
				<th>发时--到时</th>
				<th>车型</th>
				<th>运行时间(小时)</th>
			</tr>
			<c:forEach items="${ train }" var="train" varStatus="status">
				<tr ${ status.count % 2 ==1?"bgcolor='#eeeeee'":"" }>
				<td><input type="checkbox" name="trainno" value="${ train.trainno }"></td>
				<td><a href="${ pageContext.request.contextPath }/getByIdServlet?trainno=${ train.trainno }">${ train.trainno }</a></td>
				<td>${ train.startstation}--${ train.arrivalstation }</td>
				<td>${ train.starttime}--${ train.arrivaltime }</td>
				<td>${ train.type }</td>
				<td>${ train.runtime }</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="6">
					<c:forEach begin="1" end="${ page }" var = "pageNum">
						<a href="${ pageContext.request.contextPath }/GetAllTrainServlet?pageNum=${ pageNum }">[${ pageNum }]</a>
					</c:forEach>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>




































