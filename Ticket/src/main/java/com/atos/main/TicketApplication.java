package com.atos.main;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
@EntityScan(basePackages = { "com.atos.model" })
@EnableJpaRepositories(basePackages =  { "com.atos.repository" })
@SpringBootApplication(scanBasePackages = "com.atos")
public class TicketApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(TicketApplication.class, args);
    }
 
}