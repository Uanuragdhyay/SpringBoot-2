package com.love2code.springcoredemo.common;

import org.springframework.stereotype.Component;
@Component
public class BaseballCoach implements Coach{
    @Override
        public String getDailyWorkout() {
            return "practice ball throwing regularly ";
        }
    }


