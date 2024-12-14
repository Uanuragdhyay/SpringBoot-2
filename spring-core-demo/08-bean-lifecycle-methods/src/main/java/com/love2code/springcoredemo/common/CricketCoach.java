package com.love2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("in constructor:"+getClass().getSimpleName());
    }
    //do our init method
    @PostConstruct
    public void DoMyStartUpStuff(){
        System.out.println("in DoMyStartUpStuff(): "+getClass().getSimpleName());
    }
    @PreDestroy
    public void DoMyCleanUpStuff(){
        System.out.println("in DoMyCleanUpStuff(): "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice spin bowling rigourously ";
    }
}
