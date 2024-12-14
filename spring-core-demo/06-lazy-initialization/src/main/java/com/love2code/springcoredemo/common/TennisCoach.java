package com.love2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("in constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice backhand regularly ";
    }
}