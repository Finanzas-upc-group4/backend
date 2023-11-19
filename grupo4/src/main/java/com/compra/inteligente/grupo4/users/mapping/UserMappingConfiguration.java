package com.compra.inteligente.grupo4.users.mapping;

import com.compra.inteligente.grupo4.shared.mapping.EnhancedModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("usersMappingConfiguration")
public class UserMappingConfiguration {
    @Bean
    public UserMapper userMapper(){ return new UserMapper();}

}
