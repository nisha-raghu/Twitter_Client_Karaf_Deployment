<!-- Invokes the twitter api to Follow Elon musk 

	Author
	Nisha Raghu -->
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
You are now Following Elon Musk!!!
 <%
 Tweetsmypage.followElon();
%>

</body>  
</html>