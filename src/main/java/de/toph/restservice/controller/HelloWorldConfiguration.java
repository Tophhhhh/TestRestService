package de.toph.restservice.controller;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Getter
@RefreshScope
@Configuration
public class HelloWorldConfiguration {

    @Value("${rest.service.test.value}")
    private String value;

}
