package com.lifefire.loveForPeople;

import com.lifefire.loveForPeople.initDB.RepDB;
import com.lifefire.loveForPeople.service.FullDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class LoveForPeopleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveForPeopleApplication.class, args);
	}

}
