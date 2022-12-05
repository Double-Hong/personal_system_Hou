package com.example.personal_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.personal_system.mapper")
public class PersonalSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalSystemApplication.class, args);
    }

}
