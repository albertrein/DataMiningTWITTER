/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterbot;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author WRiker
 */
public class TwitterBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cf = new ConfigurationBuilder();
        
        cf.setDebugEnabled(true)
            .setOAuthConsumerKey("cMFIRGpcriIR6zEDHAaAAjEzJ")
            .setOAuthConsumerSecret("QW0iFZTwPZsNcuKJ45ZC4mBXZD8k0FvDhsiFvxJKBM27e4OMH2")
            .setOAuthAccessToken("4236395313-NTid0I2ltRLaDZpmwry1GmOs4qxqPO3gNAzFpcU")
            .setOAuthAccessTokenSecret("lQUemys6y1GRSqquyxUbZWJBxW62C92lsxwvZ4319kRhB");
            
        TwitterFactory tf = new TwitterFactory(cf.build());
        twitter4j.Twitter twitter = tf.getInstance();
        
        //List<Status> status = twitter.getHomeTimeline();
        Query query = new Query("source:w riker");
        QueryResult result = twitter.search(query);
        
       
        for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        
    }
    
}}
