package com.zeng.helloquick.config;

import com.zeng.helloquick.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public PersonService personService(){
        return new PersonService();
    }
}
