package com.love2code.springcoredemo.common;

import org.springframework.context.annotation.Bean;

public class SwimCoach implements Coach {
    public SwimCoach(){
        System.out.println("in constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "swim 100 metres";
    }
}
