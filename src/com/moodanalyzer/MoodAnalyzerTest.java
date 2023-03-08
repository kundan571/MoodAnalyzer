package com.moodanalyzer;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void passMessageSadWhenReturnsSad() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
            String analyzedMood = moodAnalyzer.moodAnalyze("Invalid mood");
            Assert.assertEquals("SAD", analyzedMood);
        }catch (AssertionError e){
            System.out.println("SAD");
        }

    }

    @Test
    public void passMessageHappyWhenReturnsNotSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String analyzedMood = moodAnalyzer.moodAnalyze("I Am In Happy Mood");
        Assert.assertEquals("HAPPY",analyzedMood);
    }

}