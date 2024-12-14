package com.love2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("in constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice spin bowling rigourously ";
    }
}