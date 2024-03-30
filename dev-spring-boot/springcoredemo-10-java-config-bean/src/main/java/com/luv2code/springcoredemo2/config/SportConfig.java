package com.luv2code.springcoredemo2.config;

import com.luv2code.springcoredemo2.common.Coach;
import com.luv2code.springcoredemo2.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
    /*
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
     */
}
