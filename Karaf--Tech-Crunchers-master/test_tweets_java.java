/*
Author:
Name:Rajesh madira 
Sjsu Id:011423321
*/
package org.esp.jsp;

import junit.framework.*;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

import java.io.IOException;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;


import org.esp.jsp.Tweetsmypage;


public class test_tweets_java extends TestCase {
  protected int value1, value2;
  Tweetsmypage test = new Tweetsmypage();
  
  
  
  // assigning the values
  protected void setUp(){
  
     Tweetsmypage.ConsumerSecret="Your Consumer Secret key";
     Tweetsmypage.AccessSecret="Your Access secret key";
     Tweetsmypage.AccessToken ="Your Access token";
     Tweetsmypage.ConsumerKey="Your Consumer Key";
     Tweetsmypage.tweetAllTweets="https://api.twitter.com/1.1/statuses/user_timeline.json";
     Tweetsmypage.tweetRecentMessagesUri="https://api.twitter.com/1.1/direct_messages/sent.json?count=10&since_id=780539740785299456";
     Tweetsmypage.tweetReTweets = "https://api.twitter.com/1.1/statuses/retweets_of_me.json?count=50&since_id=780539740785299456"; 
     Tweetsmypage.getmsgtweetUri = "https://api.twitter.com/1.1/direct_messages.json?since_id=780539740785299456";
     Tweetsmypage.getUserbyIdUri = "https://api.twitter.com/1.1/users/search.json?q=Twitter%20API&page=1&count=3";
     Tweetsmypage.getFavoriteListUri = "https://api.twitter.com/1.1/favorites/list.json?count=2&screen_name=rafarakesh19";
     Tweetsmypage.followElonUri = "https://api.twitter.com/1.1/friendships/create.json?user_id=44196397&follow=true";
     Tweetsmypage.tweetAllTweets = "https://api.twitter.com/1.1/statuses/user_timeline.json";
     
  }


  public void testgetallTweets() throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, ParseException, IOException, JSONException{
     assert(Tweetsmypage.getAllTweets().getJSONObject(0).getString("truncated").equals("false") == true);
  }
  
  public void testtweetRecentMessages() throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, ParseException, IOException, JSONException{
	   	  assert(Tweetsmypage.tweetRecentMessages().getJSONObject(0).getString("sender_id_str").equals("247651442") == true); 
	   }
  
  public void testtweetReTweets() throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, ParseException, IOException, JSONException{
	   	  assert(Tweetsmypage.tweetReTweets().getJSONObject(0).getString("text").equals("Hello Twitter World.") == true);
	   }
  
  public void testgetmsgtweet() throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, ParseException, IOException, JSONException{
	   	 assert(Tweetsmypage.getmsgtweet().getJSONObject(0).getString("created_at").equals("Sat Oct 01 22:07:08 +0000 2016") == true);
	   }
  
  public void testgetUsebyId() throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, ParseException, IOException, JSONException{
	   	 assert(Tweetsmypage.getUsebyId().getJSONObject(0).getString("friends_count").equals("47") == true);
	   }
  
  public void testgetFavoriteList() throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, ParseException, IOException, JSONException{
	   	 assert(Tweetsmypage.getFavoriteList().getJSONObject(0).getString("retweet_count").equals("1665") == true);
	   }
  
  public void testTweetson() throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, ParseException, IOException, JSONException{
	      Tweetsmypage test = new Tweetsmypage();
	      test.ConsumerSecret="Your Consumer Secret key";
	      test.AccessSecret="Your Access secret key";
	      test.AccessToken ="Your Access token";
	      test.ConsumerKey="Your Consumer Key";
	      test.tweetAllTweets = "https://api.twitter.com/1.1/statuses/user_timeline.json";
	   	 assert(test.Tweetson(test.tweetAllTweets).getJSONObject(0).getString("created_at").equals("Sat Oct 01 21:44:35 +0000 2016") == true);
	   }
}
