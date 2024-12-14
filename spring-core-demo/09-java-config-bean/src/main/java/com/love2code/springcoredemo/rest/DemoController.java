package com.love2code.springcoredemo.rest;

import com.love2code.springcoredemo.common.BaseballCoach;
import com.love2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private Coach myCoach;



    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach){
        System.out.println("in constructor:"+getClass().getSimpleName());
        myCoach=theCoach;

    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


    }

