<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>英文翻译词典</title>
</head>
<body>
<center>
  <h1>英文翻译词典</h1>
  <hr/>
  <form action="Translator" method="post" style="font-size: 18px;">
     <span>请输入要翻译的单词：</span>
     <input type="text" name="word"/>
     <input type="submit" value="翻译">
  </form>
  <div style="margin-top: 50px;float: left;">
    <font color="red" style="font-size: 18px;float: left;">翻译结果：</font><br/>
    <span style="font-size: 16px;float: left;">${infor}</span>
  </div>
</center>
</body>
</html>
