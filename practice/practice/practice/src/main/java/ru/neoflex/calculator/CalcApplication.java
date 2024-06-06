package ru.neoflex.calculator;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Neoflex Practice API",
                version = "3.0.0",
                description = "API for Neoflex Practice created by Darya Kovaleva",
                termsOfService = "https://www.runcodenow.com",
                contact = @Contact(
                        name = "Darya Kovaleva",
                        email = "daryenayakov@mail.ru"
                ),
                license = @License(
                        name = "License",
                        url = "https://www.runcodenow.com/license"
                )
        )
)
public class CalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalcApplication.class, args);
    }

}