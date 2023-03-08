package com.moodanalyzer;

public class MoodAnalyzer {

    public String moodAnalyze(String message) {
        if (message == "I Am In Sad Mood") {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
