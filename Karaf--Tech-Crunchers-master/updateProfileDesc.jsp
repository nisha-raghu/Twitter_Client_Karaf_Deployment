<!-- Invokes the Twitter Api to update description of the user

	Author
	Nisha Raghu
	Kusuma Sri Chunduru
 -->
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.net.HttpURLConnection,java.io.*,java.lang.*,org.esp.jsp.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Your Profile Description Has been updated.Please check your Twitteraccount to confirm.
 <%
	Tweetsmypage.updateyourProfileDesc();
%>
</body>  
</html>