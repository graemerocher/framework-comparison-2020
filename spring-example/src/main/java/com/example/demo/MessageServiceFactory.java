package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageServiceFactory {

    private final String message;

    public MessageServiceFactory(
            @Value("${hello.message:Hello}") String message) {
        this.message = message;
    }

    @Bean
    MessageService messageService() {
        return new MessageService(message);
    }
}
