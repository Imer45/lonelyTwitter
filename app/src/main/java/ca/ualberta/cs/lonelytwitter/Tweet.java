package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private ArrayList<CurrentMood> moods = new ArrayList<CurrentMood>();

    private static final Integer MAX_CHARS = 200;

    Tweet() {
        this.date = new Date();
        this.message = "I'm a default message";
    }

    Tweet(String message){
        this.date = new Date();
        this.message = message;
    }

    public Date getDate(){return this.date;}

    public String getMessage(){
        return this.message + this.moods.get(0).getMood();
    }

    public ArrayList<CurrentMood> getMoods(){
        return this.moods;
    }

    public void setMoods(ArrayList<CurrentMood> moods){
        this.moods = moods;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= this.MAX_CHARS) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public abstract Boolean isImportant();

}