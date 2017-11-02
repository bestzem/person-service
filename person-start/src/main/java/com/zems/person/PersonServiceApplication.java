package com.zems.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class PersonServiceApplication {
    //本文件放在root package下
	public static void main(String[] args) {
		SpringApplication.run(PersonServiceApplication.class, args);
	}
}
