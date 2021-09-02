package ru.lyuchkov.heroesofroutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class HeroesOfRoutineApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroesOfRoutineApplication.class, args);
    }

}
