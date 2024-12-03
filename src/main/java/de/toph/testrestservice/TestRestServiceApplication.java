package de.toph.testrestservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class TestRestServiceApplication implements CommandLineRunner {

    @Autowired
    private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(TestRestServiceApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
        System.out.println( env.getProperty("spring.config.location"));
        System.out.println( env.getProperty("rest.service.test.value"));
    }
}
