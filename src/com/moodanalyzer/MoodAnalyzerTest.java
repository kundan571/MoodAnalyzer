package com.moodanalyzer;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void passMessageSadWhenReturnsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I Am In Sad Mood");
        String analyzedMood = moodAnalyzer.moodAnalyze();
        Assert.assertEquals("SAD", analyzedMood);
    }

    @Test
    public void passMessageHappyWhenReturnsNotSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I Am In Happy Mood");
        String analyzedMood = moodAnalyzer.moodAnalyze();
        Assert.assertEquals("HAPPY", analyzedMood);
    }

}