package com.love2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("in constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice sprinting fastly ";
    }
}
