package de.toph.restservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldConfiguration helloWorldConfiguration;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return helloWorldConfiguration.getValue();
    }
}
