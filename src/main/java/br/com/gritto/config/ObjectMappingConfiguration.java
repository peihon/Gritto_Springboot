package br.com.gritto.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMappingConfiguration {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

}
