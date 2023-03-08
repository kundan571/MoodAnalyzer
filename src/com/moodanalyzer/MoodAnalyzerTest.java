package com.moodanalyzer;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void passMessageSadWhenReturnsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String analyzedMood = moodAnalyzer.moodAnalyze("I Am In Sad Mood");
        Assert.assertEquals("SAD", analyzedMood);
    }

    @Test
    public void passMessageHappyWhenReturnsNotSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String analyzedMood = moodAnalyzer.moodAnalyze("I Am In Any Mood");
        Assert.assertEquals("HAPPY", analyzedMood);
    }

}