package com.udemy.masterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

//@EnableRedisRepositories(basePackages = "com.udemy.masterclass.repository")
@SpringBootApplication
public class UdemyMasterClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyMasterClassApplication.class, args);
    }

    @Profile("dev")
    @Bean
    public String dummy(){
        return "something";
    }

}
