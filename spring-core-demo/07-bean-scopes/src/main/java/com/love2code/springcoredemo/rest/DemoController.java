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
    private Coach anotherCoach;

    //define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach")Coach theanotherCoach){
        System.out.println("in constructor:"+getClass().getSimpleName());
        myCoach=theCoach;
        anotherCoach=theanotherCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/check")
        public String check(){
            return "comparing beans: myCoach == anotherCoach,"+(myCoach==anotherCoach);
        }

    }


