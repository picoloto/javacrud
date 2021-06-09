package br.com.picoloto.javacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableJpaRepositories("br.com.picoloto.*")
public class JavacrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavacrudApplication.class, args);
    }
}
