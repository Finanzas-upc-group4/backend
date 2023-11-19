package com.compra.inteligente.grupo4.data.mapping;

import com.compra.inteligente.grupo4.shared.mapping.EnhancedModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("registerMappingConfiguration")
public class RegisterMappingConfiguration {

    @Bean
    public EnhancedModelMapper modelMapper(){ return new EnhancedModelMapper();}
}
