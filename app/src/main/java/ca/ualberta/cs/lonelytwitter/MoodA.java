package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class MoodA extends CurrentMood {
    private String Mood;

    MoodA(Date date){
        super(date);
        this.Mood = "Happy!";
    }

    MoodA(){
        super();
        this.Mood = "Happy!";
    }

    @Override
    public String getMood() {
        return this.Mood;
    }
}