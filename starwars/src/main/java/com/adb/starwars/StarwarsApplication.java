package com.adb.starwars;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarwarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarwarsApplication.class, args);
		}
	}
