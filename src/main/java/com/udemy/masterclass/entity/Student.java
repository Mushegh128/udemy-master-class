package com.udemy.masterclass.entity;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Student")
public class Student implements Serializable {
  
    public enum Gender { 
        MALE, FEMALE
    }

    private String key;
    private String name;
    private Gender gender;
    private int grade;
}