package com.example.user.with.validation;

import com.example.user.with.validation.repository.IUserRepository;
import com.example.user.with.validation.service.IUserInterface;
import com.example.user.with.validation.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService(IUserRepository userRepository) {
        return new UserService(userRepository);
    }

}