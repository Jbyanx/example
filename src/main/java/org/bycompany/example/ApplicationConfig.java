package org.bycompany.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("first Bean");
    }
}
