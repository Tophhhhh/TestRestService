package de.toph.restservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class KubernetesRestServiceApplication implements CommandLineRunner {

    private final Environment env;

	public static void main(String[] args) {
		SpringApplication.run(KubernetesRestServiceApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        log.info("test");
        log.info("location : {}", env.getProperty("spring.config.location"));
        log.info("rest value : {}", env.getProperty("rest.service.test.value"));
    }
}
