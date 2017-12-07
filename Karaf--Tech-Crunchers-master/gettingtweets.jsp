<!-- Home Page which displays all buttons to invoke the Twitter Apis

	Author
	Kusuma Sri Chunduru
	Nisha Raghu -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.net.HttpURLConnection,java.io.*,java.lang.*,org.esp.jsp.*" %>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Getting tweets</title>

</head>
<body>

<H1>Accessing Twitter API</H1>

<button type="button" onclick="location = 'updateProfileDesc.jsp'" name="updateProfileDesc">Update Profile Description</button>
<button type="button" onclick="location = 'followElon.jsp'" name="followElon">Follow Elon Musk</button>
<button type="button" onclick="location = 'getFavoriteList.jsp'" name="getFavoriteList">Get Favorites</button>
<button type="button" onclick="location = 'getUserinfo.jsp'"name="getUserinfo">Get a User Info</button>
<button type="button" onclick="location = 'getAllmsg.jsp'"  name="getmessage">Get all messages in Inbox</button>
<button type="button" onclick="location = 'retweet.jsp'" name="retweet">Retweet</button>
<button type="button" onclick="location = 'tweetsonmypage.jsp'" name="tweetonmypage">Display all Tweets</button>
<button type="button" onclick="location = 'tweetmsgSent.jsp'" name="tweetmsgSent">Get Recent Messages Sent</button>

</body>
</html>