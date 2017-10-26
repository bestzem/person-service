package com.zems.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonServiceApplication {
    //本文件放在root package下
	public static void main(String[] args) {
		SpringApplication.run(PersonServiceApplication.class, args);
        System.out.println("start");
	}
}
