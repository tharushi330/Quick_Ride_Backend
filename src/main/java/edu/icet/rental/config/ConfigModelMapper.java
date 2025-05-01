package edu.icet.rental.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigModelMapper {
    @Bean //IOC Container eka athule object ekak hadanwa
    public ModelMapper getMapper() {
        return new ModelMapper();
    }

}
