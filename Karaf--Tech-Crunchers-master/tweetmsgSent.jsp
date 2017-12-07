<!-- Invokes the Twitter Api to display all messages in the Sent box

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
<table>
	<tr>
		<td> CREATED AT</td>
		<td> TEXT </td>
	</tr>	

 <%
 JSONArray results = Tweetsmypage.tweetRecentMessages();
 
 for(int i=0; i< results.length();i++){
%>
	<tr>
		<td>	 
			<%=((String)((JSONObject) results.get(i)).get("created_at")) %> 
		</td>
		<td>
			<%=((String)((JSONObject) results.get(i)).get("text")) %>
		</td>	
	</tr> 	
 <%
	 }
 %>
 </table> 
</body>  
</html>