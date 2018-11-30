package com.crud;

import com.crud.model.User;
import com.crud.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Date;

@Configuration()
@EnableMongoRepositories(basePackages = "com.crud.repository")
public class MongoConfig {

    @Bean()
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return out -> {
            userRepository.save(new User("gozzz", "max", "bakh", 22, "gozzz@mail.ru", new Date()));
            userRepository.save(new User("gozzz1", "max1", "bakh1", 22, "gozzz1@mail.ru", new Date()));
            userRepository.save(new User("gozzz14", "max14", "bakh14", 11, "gozzz14@mail.ru", new Date()));
            userRepository.save(new User("gozzz13", "max1", "bakh1", 11, "gozzz1@mail.ru", new Date()));
        };
    }
}
