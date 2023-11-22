package com.compra.inteligente.grupo4.data.mapping;


import com.compra.inteligente.grupo4.shared.mapping.EnhancedModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("generalDataMappingConfiguration")
public class GeneralDataMappingConfiguration {

    @Bean
    public GeneralDataMapper generalDataMapper(){ return new GeneralDataMapper();}
}
