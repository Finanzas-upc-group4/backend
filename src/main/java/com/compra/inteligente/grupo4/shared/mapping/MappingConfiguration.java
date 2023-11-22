package com.compra.inteligente.grupo4.shared.mapping;

import com.compra.inteligente.grupo4.data.mapping.GeneralDataMapper;
import com.compra.inteligente.grupo4.data.mapping.RegisterMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("enhancedModelMapperConfiguration")
public class MappingConfiguration {

    @Bean
    public EnhancedModelMapper modelMapper(){ return new EnhancedModelMapper();}




}
