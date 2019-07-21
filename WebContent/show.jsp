<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>用户id：${u.uid}</p>
<p>账户：${u.username}</p>
<p>密码：${u.password}</p>
   <table width="500px" border="1" cellspacing="0">
   	  <tr>
   	    <td>编号</td>
   	    <td>名称</td>
   	    <td>作者</td>
   	    <td>价格</td>
   	    <td>操作</td>
   	  </tr>
      <c:forEach var="book" items="${books }">
         <tr>
	   	    <td>${book.bid }</td>
	   	    <td>${book.bname }</td>
	   	    <td>${book.author }</td>
	   	    <td>${book.price }</td>
	   	    <td><a href="delete.do?bid=${book.bid }">删除</a>&nbsp;<a href="update.do?bid=${book.bid }">修改</a></td>
   	  	</tr>
      </c:forEach>
   </table>
</body>
</html>