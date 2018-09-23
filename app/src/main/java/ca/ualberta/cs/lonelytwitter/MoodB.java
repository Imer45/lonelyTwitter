package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class MoodB extends CurrentMood {
    private String Mood;

    MoodB(Date date){
        super(date);
        this.Mood = "Mad!";
    }

    MoodB(){
        super();
        this.Mood = "Mad!";
    }

    @Override
    public String getMood() {
        return this.Mood;
    }
}